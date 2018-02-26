package reArrangePosAndNegNumbers;

public class Main {
	static int countNeg = 0;
	static int countPosIndexStart = 0;
	public static void main(String[] args) {
		int[] a = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		reArrange(a);
	}

	private static void reArrange(int[] a) {
		int currentPos = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				swap(i, currentPos, a);
				currentPos++;
				countNeg++;
			}
		}
		placeAlternatively(a);
		printArray(a);
	}

	private static void swap(int x, int y, int[] a) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	private static void printArray(int[]a){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + ",");
		}
	}

	private static void placeAlternatively(int[] a){
		countPosIndexStart = countNeg;
		int negQuality = countNeg ;
		int posQuality = a.length - negQuality;
		int length = (negQuality<posQuality)? negQuality:posQuality;

		for(int i = 0; i < length ; i+=2){
			swap(i, countPosIndexStart, a);
			countPosIndexStart+=2;
		}
	}
}
