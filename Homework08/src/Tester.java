/*
 * Written by Christopher Moyer
 */
import java.util.Random;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxArrayBinHeap heap = new MaxArrayBinHeap<Jeep>();
		Random r = new Random();
		
		System.out.println("Adding 15 jeeps");
		for(int i=0;i<15;i++)
		{
			Jeep newJeep = new Jeep("Jeep"+(i+1),r.nextInt(5000),r.nextInt(708));
			heap.addJeep(newJeep);
		}
		
		System.out.println("Roll Call");
		heap.jeepRollCall();
		
		System.out.println("Removing 5 jeeps");
		heap.removeJeep();
		heap.removeJeep();
		heap.removeJeep();
		heap.removeJeep();
		heap.removeJeep();
		
		System.out.println("Roll Call");
		heap.jeepRollCall();
		
		System.out.println("Sorting Jeeps");
		heap.jeepHeapSort();
		
		
	}

}
