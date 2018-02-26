package findKthSmallest;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 7, 10, 3, 50, 8, 15, 2, 9 };
		int k = 2;
		int low = 0;
		int high = arr.length - 1;
		findKthSmallestNumber(arr, low, high, k);
	}

	private static int findKthSmallestNumber(int[] arr, int low, int high, int k) {
		if (k > 0 && k <= high - low + 1) {
			int pos = Partition(arr, 0, high);
			if (pos - low == k - 1) {
				System.out.println(arr[pos]);
				return arr[pos];
			} else if (pos - low > k - 1)
				return findKthSmallestNumber(arr, low, pos - 1, k);
			return findKthSmallestNumber(arr, pos + 1, high, k - pos + low - 1);
		}
		return -1;
	}

	private static int Partition(int[] arr, int low, int high) {
		int i = low - 1;
		int pivot = arr[high];
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return i + 1;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
