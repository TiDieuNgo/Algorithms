package rotationcount;

public class Main {
	public static void main(String[] args) {
		int[] arr = {};
		System.out.println(findRotationCount(arr, 0, arr.length));
	}

	private static int findRotationCount(int[] arr, int sta, int end) {
		// System.out.println(arr.length); // end = length = 6
		if (arr.length == 0)
			return -1;
		if (arr.length == 1 || sta == end)
			return 0;
		int mid = (sta + end) / 2; // 3
		if (mid == 0)
			mid = 1;
		if (arr[mid] < arr[mid - 1])
			return mid;
		if (arr[mid] > arr[mid + 1])
			return mid + 1;
		if (arr[mid] > arr[mid - 1])
			return findRotationCount(arr, sta, mid - 1);
		return findRotationCount(arr, mid + 1, end);
	}
}
