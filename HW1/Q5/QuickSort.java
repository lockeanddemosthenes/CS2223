
public class QuickSort {
	/**
	 * @param arr array being sorted
	 * @param low integer containing low index
	 * @param high integer containing high index
	 */
	void sort(int arr[], int low, int high) {
		if(low < high) {
			int partitionInd = partition(arr, low, high);
			sort(arr, low, partitionInd-1);
			sort(arr, partitionInd+1, high);
		}
	}
	
	/**
	 * @param arr array being sorted
	 * @param low integer containing low index
	 * @param high integer containing high index
	 * @return pivot index
	 */
	int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);
		for(int j = low; j < high; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}
}
