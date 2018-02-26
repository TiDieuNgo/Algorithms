package arrayToReducedForm;

public class SimpleWay {
	public static void main(String[] args) {
		int[] arr = { 100, 210, 120, 90 };
		convertToReducedForm(arr);
	}

	private static void convertToReducedForm(int[] arr) {
		int count = 0;
		int[] temp = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j])
					count++;
			}
			temp[i] = count;
		}
		printResult(temp);
	}

	private static void printResult(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
