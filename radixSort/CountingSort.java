package radixSort;

public class CountingSort {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 1, 3, 5, 7, 0 };
		countingSort(arr);
	}

	private static void countingSort(int[] arr){
		int max = findMax(arr);
		int[] counts = new int[max + 3]; // 10 should be the max element of arr.

		int[] result = new int[arr.length];

		for (int i = 0; i < arr.length; i++)
			counts[arr[i]]++;

		
		
		for (int i = 1; i < 10; i++)
			counts[i] += counts[i - 1];

		
		for (int i = 0; i < arr.length; i++)
			System.out.print(counts[i] + " ");
		
		for (int i = 0; i < arr.length; i++) {
			result[counts[arr[i]] - 1] = arr[i];
			counts[arr[i]]--;
		}

		for (int i = 0; i < result.length; i++)
			System.out.print(result[i] + " ");
	}

	private static int findMax(int[] arr){
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];

		}
		return max;
	}

}
