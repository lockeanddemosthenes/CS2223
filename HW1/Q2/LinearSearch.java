
public class LinearSearch {
	
	/**
	 * @param arr array of sorted integers
	 * @param key integer we are looking for
	 */
	public void linearSearch(int arr[], int key) {
		int stepCounter = 0;
		int length = arr.length;
		
		for(int i = 0; i < length; i++) {
			stepCounter++;
			if (arr[i] == key) {
				System.out.println("LS for " + arr.length + ": " + stepCounter);
				break;
			}
		}
	}
}
