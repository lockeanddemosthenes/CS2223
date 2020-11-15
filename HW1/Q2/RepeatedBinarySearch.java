
public class RepeatedBinarySearch {
	int stepCounter = 0;
	
	/**
	 * @param arr array of sorted integers
	 * @param key integer we are searching for
	 * @param low lowest index of the array
	 * @param high highest index of the array
	 */
	public void repeatedBinarySearch(int arr[], int low, int high, int key) {
		
		while(high >= low) {
			stepCounter++;
			int middle = (low + high - 1) / 2;
		
			if(arr[middle] == key) {
				stepCounter++;
				System.out.println("Repeated Binary Search Steps: " + stepCounter);
				break;
			}
			
			if(arr[middle] > key) {
				stepCounter++;
				repeatedBinarySearch(arr, key, low, middle - 1);
			} else if(arr[middle] < key) {
				stepCounter++;
				repeatedBinarySearch(arr, key, middle + 1, high);
			} else System.out.println("Key not found in RBS after" + stepCounter + " runs");
		}
	}
}
