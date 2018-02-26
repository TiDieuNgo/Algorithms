package arrayToReducedForm;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapWay {

	public static void main(String[] args) {
		int[] arr = { 100, 90, 130, 40 };
		convertToReducedForm(arr);
	}

	private static void convertToReducedForm(int[] arr) {
		int[] tempArr = Arrays.copyOf(arr, arr.length);
		HashMap<Integer, Integer> myHM = new HashMap<Integer, Integer>();
		Arrays.sort(tempArr);
		putValuesToHM(myHM, tempArr);
		getResult(myHM, arr, tempArr);
		printResult(tempArr);
	}

	private static void putValuesToHM(HashMap<Integer, Integer> myHM, int[] tempArr) {
		for (int i = 0; i < tempArr.length; i++) {
			myHM.put(tempArr[i], i);
		}
	}

	private static void getResult(HashMap<Integer, Integer> myHM, int[] arr, int[] tempArr) {
		for (int i = 0; i < arr.length; i++) {
			if (myHM.containsKey(arr[i]))
				tempArr[i] = myHM.get(arr[i]);
		}
	}

	private static void printResult(int[] tempArr) {
		for (int i = 0; i < tempArr.length; i++) {
			System.out.print(tempArr[i] + " ");
		}
	}
}
