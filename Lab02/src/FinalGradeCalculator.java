/*
 * Written by Christopher Moyer
 */
import java.io.*;
import java.util.Scanner;
public class FinalGradeCalculator {
	public static final int GRADE_TYPES = 8;
	public static final int LABS = 0;
	public static final int HOMEWORK = 1;
	public static final int EXAM_1 = 2;
	public static final int EXAM_2 = 3;
	public static final int LAB_EXAM_1 = 4;
	public static final int LAB_EXAM_2 = 5;
	public static final int FINAL = 6;
	public static final int EXTRA_CREDIT = 7;
	
	public static final double LAB_WEIGHT = 0.20;
	public static final double HOMEWORK_WEIGHT = 0.30;
	public static final double LAB_EXAM_WEIGHT = 0.10;
	public static final double EXAM_WEIGHT = 0.10;
	public static final double FINAL_WEIGHT = 0.10;
	public static final double EXTRA_CREDIT_WEIGHT = 0.02;
	
	public static double[][] readFromFile(String fileName)
	{
		if(fileName == null)
			return null;
		try
		{
			//Count total number of grades
			Scanner fileScanner = new Scanner(new File(fileName));
			int arrayCount = 0;
			int arraysConstructed = 0;
			int[] gradeCount = new int[GRADE_TYPES];
			fileScanner.nextLine();
			do {
				if(fileScanner.hasNextInt() == false)
				{
					gradeCount[arraysConstructed] = arrayCount;
					arraysConstructed++;
					fileScanner.nextLine();
					arrayCount = 0;
				}
				else
				{
					arrayCount++;
					fileScanner.nextLine();
					if(fileScanner.hasNextLine() == false)
					{
						gradeCount[arraysConstructed] = arrayCount;
					}
				}
			} while(fileScanner.hasNextLine());
			//Construct arrays
			double[][] grades = new double[GRADE_TYPES][];
			for(int i=0;i<gradeCount.length;i++)
			{
				grades[i] = new double[gradeCount[i]];
			}
			//Populate array with grades
			fileScanner = new Scanner(new File(fileName));
			fileScanner.nextLine();
			arrayCount = 0;
			arraysConstructed = 0;
			while(fileScanner.hasNextLine())
			{
				if(fileScanner.hasNextInt())
				{
					grades[arraysConstructed][arrayCount] = fileScanner.nextInt();
					arrayCount++;
					if(fileScanner.hasNextLine())
					{
					fileScanner.nextLine();
					}
				}
				else
				{
					arraysConstructed++;
					fileScanner.nextLine();
					arrayCount = 0;
				}
			}
			fileScanner.close();
			return grades;
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			return null;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double grades[][] = readFromFile("grades.txt");
		
		double finalGrade = 0;
		double homeworkAverage = 0;
		//Why int and not double in example?
		double labAverage = 0;
		double extraCreditTotal = 0;
		
		//Calculate Lab Average
		for(int i=0; i<grades[LABS].length;i++)
		{
			labAverage+=grades[LABS][i];
		}
		labAverage = labAverage/grades[LABS].length;
		System.out.println("Your lab average is "+labAverage);
		
		//Calculate Homework Average
		//Sort grades to find lowest
		boolean hasSwapped = true;
		while(hasSwapped)
		{
			hasSwapped = false;
			for(int i = 0; i < grades[HOMEWORK].length-1; i++)
			{
				if(grades[HOMEWORK][i] > grades[HOMEWORK][i+1]) //swap
				{
					double temp = grades[HOMEWORK][i];
					grades[HOMEWORK][i] = grades[HOMEWORK][i+1];
					grades[HOMEWORK][i+1] = temp;
					hasSwapped = true;
				}
			}
		}
		//Calculate Homework average without lowest grade
		for(int i=1;i<grades[HOMEWORK].length;i++)
		{
			homeworkAverage += grades[HOMEWORK][i];
		}
		homeworkAverage = homeworkAverage/(grades[HOMEWORK].length-1);
		System.out.println("Your homework average is "+homeworkAverage);
		
		//Exams
		System.out.println("Your first exam is "+grades[EXAM_1][0]);
		System.out.println("Your second exam is "+grades[EXAM_2][0]);
		
		//Lab Exams
		System.out.println("Your first lab exam is "+grades[LAB_EXAM_1][0]);
		System.out.println("Your second lab exam is "+grades[LAB_EXAM_2][0]);
		
		//Final
		System.out.println("Your final is "+ grades[FINAL][0]);
		
		//Extra Credit
		for(int i=0;i<grades[EXTRA_CREDIT].length;i++)
		{
			extraCreditTotal += (grades[EXTRA_CREDIT][i] * EXTRA_CREDIT_WEIGHT);
		}
		System.out.println("Your extra work total is "+extraCreditTotal+" points");
		
		//Final Grade
		finalGrade += (homeworkAverage*HOMEWORK_WEIGHT);
		finalGrade += (labAverage*LAB_WEIGHT);
		finalGrade += (grades[LAB_EXAM_1][0]*LAB_EXAM_WEIGHT);
		finalGrade += (grades[LAB_EXAM_2][0]*LAB_EXAM_WEIGHT);
		finalGrade += (grades[EXAM_1][0]*EXAM_WEIGHT);
		finalGrade += (grades[EXAM_2][0]*EXAM_WEIGHT);
		finalGrade += (grades[FINAL][0]*FINAL_WEIGHT);
		finalGrade += extraCreditTotal;
		finalGrade = Math.ceil(finalGrade);
		System.out.println("Your raw total is "+finalGrade);
		
		//Letter Grade
		if(finalGrade>=90)
		{
			System.out.println("Your final grade is A");
		}
		else if(finalGrade>=85 && finalGrade<=89)
		{
			System.out.println("Your final grade is B+");
		}
		else if(finalGrade>=80 && finalGrade<=84)
		{
			System.out.println("Your final grade is B");
		}
		else if(finalGrade>=75 && finalGrade<=79)
		{
			System.out.println("Your final grade is C+");
		}
		else if(finalGrade>=70 && finalGrade<=74)
		{
			System.out.println("Your final grade is C");
		}
		else if(finalGrade>=65 && finalGrade<=69)
		{
			System.out.println("Your final grade is D+");
		}
		else if(finalGrade>=60 && finalGrade<=64)
		{
			System.out.println("Your final grade is D");
		}
		else if(finalGrade<60)
		{
			System.out.println("Your final grade is F");
		}
	}

}
