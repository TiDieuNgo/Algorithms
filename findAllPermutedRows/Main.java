package findAllPermutedRows;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 2, 1, 3, 4 }, { 4, 3, 2, 1 }, { 2, 2, 5, 2 } };
		findPermutedRow(arr, 2);
	}

	private static void findPermutedRow(int[][] arr, int row){
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++){
			map.put(arr[row][i], arr[row][i]);
		}

		for(int i = 0; i < arr.length; i++){
			boolean flag = true;
			for(int j = 0; j < arr.length; j++){
				if (i != row) {
					if (!map.containsKey(arr[i][j])) {
						flag = false;
						break;
					}
				}
				else {
					flag = false;
				}
			}
			if (flag) {
				System.out.println(i);
			}
		}
	}
}
