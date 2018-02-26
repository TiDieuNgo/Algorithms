package NextGreatElement;

import java.util.Stack;

public class NGE {
	public static void main(String[] argc) {
		int[] a = {13, 7, 6, 12};
		NGE(a);
	}

	private static void NGE(int[] a) {
		int x = Integer.MIN_VALUE;

		System.out.println(x + " " + Integer.MAX_VALUE);
		Stack<Integer> myStack = new Stack<Integer>();
		myStack.push(a[a.length-1]);
		System.out.println("-1");
		for (int i = a.length-2; i >= 0; i--) {
			while (!myStack.isEmpty()) {
				if (a[i] < myStack.peek()) {
					System.out.println(myStack.peek());
					myStack.push(a[i]);
					break;
				} else {
					myStack.pop();
				}
			}
			if (myStack.isEmpty()) {
				System.out.println("-1");
			}
		}
	}
}
