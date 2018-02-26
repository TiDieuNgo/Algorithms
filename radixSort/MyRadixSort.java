package radixSort;

public class MyRadixSort {
	public static void main(String[] agrs) {
		int[] arr = { 170, 45, 75, 90, 802, 24, 2, 66 };
		int n = arr.length;
		radixSort(arr, n);
	}

	private static void radixSort(int[] arr, int n) {
		int max = findMax(arr);

		//sort(arr, n, 1);
		for (int i = 1; i <= max; i *= 10) {
			sort(arr, n, i);
		}
	}

	private static void sort(int[] arr, int n, int exp) {
		int[] counts = new int[10];
		int[] result = new int[arr.length];

		for (int i = 0; i < n; i++) {
			int x = (arr[i] / exp) % 10; // i should be 1;10;100;1000 and if arr[j] =  170 = > result should be 0;
			counts[x]++;
		}


		for (int i = 1; i < 10; i++ ){
			counts[i] += counts[i -1];
		}

//		for (int i = 0; i < 10; i++)
//			System.out.print(counts[i] + " ");

		for (int i = 0; i < n; i++){
			int x = (arr[i] / exp) % 10;

			result[counts[x] - 1] = arr[i];
			counts[x]--;
		}

		for (int i = 0; i < result.length; i++){
			System.out.print(result[i] + " ");
		}

	}

	private static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}

}
