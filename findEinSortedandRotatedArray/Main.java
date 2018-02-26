package findEinSortedandRotatedArray;

public class Main {

	public static void main(String[] args) {
		int[] arr = {100,1,2};
		search(arr, 0, arr.length, 100);
	}

	private static boolean search(int[] arr, int start, int end, int key) {
		int mid = (start + end) / 2;
		if (mid == start || mid == end) {
			System.out.println("F");
			return false;
		}
		if (arr[mid] == key) {
			System.out.println("T");
			return true;
		}
		if (arr[mid] < arr[arr.length - 1])// the right side is sorted
		{
			if (key > arr[mid] && key < arr[end]) // key is in sorted list
				return binarySearch(arr, mid, end, key);
			else
				return search(arr, start, mid, key);
		} else if (key < arr[mid] && key > arr[start])
			return binarySearch(arr, start, mid, key);
		else
			return search(arr, mid, end, key);
	}

	private static boolean binarySearch(int[] arr, int start, int end, int key) {
		int mid = (start + end) / 2;
		if (arr[mid] == key) {
			System.out.println("T");
			return true;
		}
		if (arr[mid] < key)
			return binarySearch(arr, mid + 1, end, key);
		else
			return binarySearch(arr, start, mid - 1, key);
	}
}
