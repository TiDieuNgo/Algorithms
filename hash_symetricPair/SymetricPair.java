package hash_symetricPair;

import java.util.HashMap;

public class SymetricPair {
	public static void main(String[] agrc) {
		int[][] arr = new int[1][2];
		arr[0][0] = 11;
		arr[0][1] = 11;
		findSymPairs(arr);
	}

	// that means it is arr with 2 elements in an array.
	// int[][] arr = {{1,2},{2,3},{4,5}}; => foreach -> take each small arr with
	// 2 elements in big arr -> for (int[] a : arr)

	private static void findSymPairs(int[][] arr) {
		HashMap<Integer, Integer> myHash = new HashMap<Integer, Integer>();
		for (int[] a : arr) {
			if (myHash.containsKey(a[1]) && myHash.get(a[1]) == a[0]) {
				System.out.println(a[0] + ":" + a[1]);
				myHash.put(a[0], a[1]);
			}
			else{
				myHash.put(a[0], a[1]);
			}
		}
	}

}
