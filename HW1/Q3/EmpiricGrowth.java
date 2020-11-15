import java.util.Random;

public class EmpiricGrowth {
	public static void main(String[] args) {
		int[] arrayBoi = new int[1000];
		
		linearFunction(arrayBoi);
		quadraticFunction(arrayBoi);
		cubicFunction(arrayBoi);
	}
	
	//runs through linear function and prints time
	static int linearFunction(int[] arr) {
		int runs = 0;
		Stopwatch timer = new Stopwatch();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = randomFill();
			runs++;
		}
		double time = timer.elapsedTime();
		System.out.println("Linear Function Time: " + time);
		return runs;
	}
	
	//runs through quadratic function and prints time
	static int quadraticFunction(int[] arr) {
		int runs = 0;
		Stopwatch timer = new Stopwatch();
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i] = randomFill();
				runs++;
			}
		}
		double time = timer.elapsedTime();
		System.out.println("Quadratic Function Time: " + time);
		return runs;
	}
	
	//runs through cubic function and prints time
	static int cubicFunction(int[] arr) {
		int runs = 0;
		Stopwatch timer = new Stopwatch();
		for(int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr.length; j++) {
				for(int k = 0; k < arr.length; k++) {
					arr[i] = randomFill();
					runs++;
				}
			}
		double time = timer.elapsedTime();
		System.out.println("Cubic Function Time: " + time);
		return runs;
	}
	
	//helper method for filling array randomly
	static int randomFill() {
		return (new Random()).nextInt(100);
	}
}
