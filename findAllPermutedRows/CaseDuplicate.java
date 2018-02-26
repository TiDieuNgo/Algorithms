package findAllPermutedRows;

import java.util.Arrays;

public class CaseDuplicate {
	public static void main(String[] args) {
		int[][] arr = { { 1, 1, 3, 4 }, { 1, 1, 3, 4 }, { 4, 1, 3, 1 }, { 1,  2, 4, 6 } };
		findPermutedRow(arr, 2);
	}

	private static void findPermutedRow(int[][] arr, int row) {
		Arrays.sort(arr[row]);
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			Arrays.sort(arr[i]);
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] != arr[row][j] || i == row) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(i + " ");
			}
		}
	}
}
