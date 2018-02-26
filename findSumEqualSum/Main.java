package findSumEqualSum;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 4, 4,4,3, 5, 1 };
		findSumEqualSum(arr);
	}

	private static void findSumEqualSum(int[] arr) {
		class Pair {
			int first;
			int second;

			Pair(int f, int s) {
				this.first = f;
				this.second = s;
			}
		}

		HashMap<Integer, Pair> map = new HashMap<>();
		HashMap<Pair, Pair> map2 = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				Pair pair_check = new Pair(arr[i], arr[j]);
				
				
				int sum = arr[i] + arr[j];
				if (map.containsKey(sum)) {
					Pair pair_result = map.get(arr[i] + arr[j]);
					System.out.print(arr[i] + " " + arr[j] + " AND " + pair_result.first + " " + pair_result.second + "\n");
					break;
				} else {
					Pair pair = new Pair(arr[i], arr[j]);
					map.put(arr[i] + arr[j], pair);
				}
			}
		}
	}
}
