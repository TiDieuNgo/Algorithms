package multipleOccurrence;

import java.util.HashMap;

public class main {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 3, 5, 5, 1, 5 };
		arrangeMultipleOccurence(arr);
	}

	private static void arrangeMultipleOccurence(int[] arr) {
		HashMap<Integer, Integer> myHM = new HashMap<Integer, Integer>();
		int[] priority = new int[arr.length];
		int index = 0;

		// put all the thing in myHM < key, theOccurenceOftheKey >
		for (int i = 0; i < arr.length; i++) {
			if (myHM.containsKey(arr[i])) {
				int occurence = myHM.get(arr[i]);
				myHM.put(arr[i], occurence + 1);
			} else {
				myHM.put(arr[i], 1);
				priority[index] = arr[i];
				index++;
			}
		}

		for (int i = 0; i < priority.length; i++) {
			int occurence = 0;
			if (myHM.containsKey(priority[i]))
				occurence = myHM.get(priority[i]);
			while (occurence != 0) {
				System.out.println(priority[i]);
				occurence--;
			}
		}

	}
}
