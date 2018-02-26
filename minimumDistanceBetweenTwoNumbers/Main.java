package minimumDistanceBetweenTwoNumbers;


public class Main {
	public static void main(String[] agrs) {
		int[] a = { 3, 3, 4, 5, 6, 7, 8, 3, 3, 3, 3, 2, 2, 6, 3 };
		int x = 2;
		int y = 3;
		findMinDistance(a, x, y);
	}

	private static void findMinDistance(int[] a, int x, int y) {
		int tempX = 0;
		int tempY = 0;
		int min = 1000; // maxInteger
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x)
				tempX = i;
			if (a[i] == y)
				tempY = i;
			if (tempX != 0 && tempY != 0) {
				int current = tempX > tempY ? tempX - tempY : tempY - tempX;
				if (current < min)
					min = current;
				min = current < min ? current : min;
			}
		}
		System.out.print(min);
	}
}
