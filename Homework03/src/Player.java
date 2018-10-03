/*
 * Written by Christopher Moyer
 */
import java.util.Random;
public class Player {
	public static final int ROCK = 0;
	public static final int PAPER = 1;
	public static final int SCISSORS = 2;
	
	private String name;
	private int numberOfWins;
	private int numberOfLosses;
	private int numberOfTies;
	
	Random r = new Random();
	
	public Player()
	{
		this.name = "None";
		this.numberOfWins = this.numberOfLosses = this.numberOfTies = 0;	
	}
	public Player(String aName)
	{
		this.name = aName;
		this.numberOfWins = 0;
		this.numberOfLosses = 0;
		this.numberOfTies = 0;
	}
	public String getName() {
		return name;
	}
	public int getNumberOfWins() {
		return numberOfWins;
	}
	public int getNumberOfLosses() {
		return numberOfLosses;
	}
	public int getNumberOfTies() {
		return numberOfTies;
	}
	public void addWin()
	{
		this.numberOfWins += 1;
	}
	public void addLoss()
	{
		this.numberOfLosses += 1;
	}
	public void addTie()
	{
		this.numberOfTies += 1;
	}
	
	public String toString()
	{
		return "Name: "+this.getName()+" Wins "+this.getNumberOfWins()+" Ties "+this.getNumberOfTies()+" Losses "+this.getNumberOfLosses();
	}
	
	public void compete(Player aPlayer1, Player aPlayer2)
	{
		int p1 = r.nextInt(2);
		int p2 = r.nextInt(2);
		
		if(p1==ROCK)
		{
			if(p2==PAPER)
			{
				System.out.println(aPlayer1.getName() + " uses Rock");
				System.out.println(aPlayer2.getName() + " uses Paper");
				System.out.println(aPlayer2.getName() + " Wins!");
				aPlayer1.addLoss();
				aPlayer2.addWin();
			}
			else if(p2==SCISSORS)
			{
				System.out.println(aPlayer1.getName() + " uses Rock");
				System.out.println(aPlayer2.getName() + " uses Scissors");
				System.out.println(aPlayer1.getName() + " Wins!");
				aPlayer1.addWin();
				aPlayer2.addLoss();
			}
			else
			{
				System.out.println(aPlayer1.getName() + " uses Rock");
				System.out.println(aPlayer2.getName() + " uses Rock");
				System.out.println("Tie");
				aPlayer1.addTie();
				aPlayer2.addTie();
			}
		}
		else if(p1==PAPER)
		{
			if(p2==SCISSORS)
			{
				System.out.println(aPlayer1.getName() + " uses Paper");
				System.out.println(aPlayer2.getName() + " uses Scissors");
				System.out.println(aPlayer2.getName() + " Wins");
				aPlayer1.addLoss();
				aPlayer2.addWin();
			}
			else if(p2==ROCK)
			{
				System.out.println(aPlayer1.getName() + " uses Paper");
				System.out.println(aPlayer2.getName() + " uses Rock");
				System.out.println(aPlayer1.getName() + " Wins!");
				aPlayer1.addWin();
				aPlayer2.addLoss();
			}
			else
			{

				System.out.println(aPlayer1.getName() + " uses Paper");
				System.out.println(aPlayer2.getName() + " uses Paper");
				System.out.println("Tie");
				aPlayer1.addTie();
				aPlayer2.addTie();
			}
		}
		else if(p1==SCISSORS)
		{
			if(p2==ROCK)
			{

				System.out.println(aPlayer1.getName() + " uses Scissors");
				System.out.println(aPlayer2.getName() + " uses Rock");
				System.out.println(aPlayer2.getName() + " Wins");
				aPlayer1.addLoss();
				aPlayer2.addWin();
			}
			else if(p2==PAPER)
			{
				System.out.println(aPlayer1.getName() + " uses Scissors");
				System.out.println(aPlayer2.getName() + " uses Paper");
				System.out.println(aPlayer1.getName() + "Wins!");
				aPlayer1.addWin();
				aPlayer2.addLoss();
			}
			else
			{
				System.out.println(aPlayer1.getName() + " uses Scissors");
				System.out.println(aPlayer2.getName() + " uses Scissors");
				System.out.println("Tie");
				aPlayer1.addTie();
				aPlayer2.addTie();
			}
		}
		
	}
}
