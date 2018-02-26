package maxOneInSpecialArr;

public class Main {
	public static void main(String[] argc) {
		int[] arr = { 1};
		int start = 0;
		int end = arr.length - 1;
		findMax(arr, start, end);
	}

	private static int findMax(int[] a, int start, int end) {
		int mid = (start + end) / 2;
		if (a.length == 0)
			return -1;
		if (start == end)
			return a[start];
		if (a[mid] > a[mid + 1] && a[mid] > a[mid - 1])
			return a[mid];
		if (a[mid] < a[mid + 1])
			return findMax(a, mid + 1, end);
		if (a[mid] > a[mid + 1])
			return findMax(a, start, mid - 1);

		return -1;
	}
}
