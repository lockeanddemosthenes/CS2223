
public class BinarySearch {
	
	/**
	 * @param arr array of sorted integers
	 * @param key integer we are looking for
	 */
	public void binarySearch(int arr[], int key) {
		int stepCounter = 0;
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high) {
			stepCounter++;
			int mid = (low + high) / 2;
			
			if(arr[mid] < key) {
				stepCounter++;
				low = mid + 1;
			} else if(arr[mid] > key) {
				stepCounter++;
				high = mid - 1;
			} else if(arr[mid] == key) {
				stepCounter++;
				System.out.println("BS for " + arr.length + ": " + stepCounter);
				break;
			}
		}
	}
}
