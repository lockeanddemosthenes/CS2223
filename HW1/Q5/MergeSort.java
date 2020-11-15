
public class MergeSort {
	/**
	 * @param arr array being sorted
	 * @param low integer containing low index
	 * @param high integer containing high index
	 */
	void sort(int arr[], int low, int high) {
		if(low < high) {
			int mid = (low + high) / 2;
			sort(arr, low, mid);
			sort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}
	
	/**
	 * @param arr array being merged
	 * @param low integer containing low index
	 * @param mid integer containing middle index
	 * @param high integer containing high index
	 */
	void merge(int arr[], int low, int mid, int high) {
		int n1 = mid - low + 1;
		int n2 = high - mid;
		
		//make subarrays
		int left[] = new int[n1];
		int right[] = new int[n2];
		
		for(int i = 0; i < n1; i++) {
			left[i] = arr[low + i];
		}
		for(int j = 0; j < n2; j++) {
			right[j] = arr[mid + 1 + j];
		}
		
		//merge subarrays
		int i = 0, j = 0;
		int k = low;
		while(i < n1 && j < n2) {
			if(left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		//copy remaining elements of left[] and right[]
		while(i < n1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j < n2) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}
}
