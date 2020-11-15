import java.util.Arrays;
import java.util.Random;

public class MainRunner {
	public static void main(String[] args) {
		int[] array100 = generateArray(100);
		int[] array1000 = generateArray(1000);
		int[] array10000 = generateArray(10000);
		
		RepeatedBinarySearch RBinary = new RepeatedBinarySearch();
		BinarySearch Binary = new BinarySearch();
		LinearSearch Linear = new LinearSearch();
		
		RBinary.repeatedBinarySearch(array100, 0, 100, 69);
		Binary.binarySearch(array100, 69);
		Linear.linearSearch(array100, 69);
		
		RBinary.repeatedBinarySearch(array1000, 0, 1000, 69);
		Binary.binarySearch(array1000, 69);
		Linear.linearSearch(array1000, 69);
		
		RBinary.repeatedBinarySearch(array10000, 0, 10000, 69);
		Binary.binarySearch(array10000, 69);
		Linear.linearSearch(array10000, 69);
	}
	
	public static int[] generateArray(int size) {
		int[] arrayGenerated = new int[size];
		
		for(int i = 0; i < size; i++) {
			arrayGenerated[i] = randomFill();
		}
		
		Arrays.sort(arrayGenerated, 0, size);
		
		return arrayGenerated;
	}
	
	public static int randomFill() {
		return (new Random()).nextInt(100);
	}
	
  public static int getMax(int[] array){ 
	    int maxVal = array[0]; 
	    for(int i=1; i < array.length; i++){ 
	      if(array[i] > maxVal){ 
	         maxVal = array[i]; 
	      } 
	    } 
	    return maxVal; 
	  }
}
