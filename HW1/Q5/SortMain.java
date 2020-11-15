import java.util.Random;

public class SortMain {
	public static void main(String[] args) {
		int[] arrayBoi = new int[100000];
		for(int i = 0; i < arrayBoi.length; i++) {
			arrayBoi[i] = randomFill();
		}
		
		System.out.println("bubble sort time: " + bubblesort(arrayBoi));
		System.out.println("merge sort time: " + mergesort(arrayBoi));
		System.out.println("quick sort time: " + quicksort(arrayBoi));
	}
	
	//runs bubble sort
	static double bubblesort(int[] arr) {
		Stopwatch timer = new Stopwatch();
		BubbleSort bsort = new BubbleSort();
		bsort.bubbleSort(arr);
		return timer.elapsedTime();
	}
	
	//runs merge sort
	static double mergesort(int[] arr) {
		Stopwatch timer = new Stopwatch();
		MergeSort msort = new MergeSort();
		msort.sort(arr, 0, arr.length - 1);
		return timer.elapsedTime();
	}
	
	//runs quick sort
	static double quicksort(int[] arr) {
		Stopwatch timer = new Stopwatch();
		QuickSort qsort = new QuickSort();
		qsort.sort(arr, 0, arr.length - 1);
		return timer.elapsedTime();
	}
	
	//helper method for filling array randomly
	static int randomFill() {
		return (new Random()).nextInt(100);
	}
}
