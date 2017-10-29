package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Isvalid {
	public static void main(String[] args) {
		String S = "[";
		System.out.print(isValid(S));
	}

	static boolean isValid(String S) {

		Map<Character, Character> map = new HashMap<>();
		map.put('[', ']');
		map.put('{', '}');
		map.put('(', ')');


		Stack<Character> myStack = new Stack<>();
		for (int i = 0; i < S.length(); i++) {
			if (map.containsKey(S.charAt(i)))
				myStack.add(S.charAt(i));
			else {
				if (myStack.isEmpty())
					return false;
				char value = myStack.pop();
				if (map.get(value) != S.charAt(i))
					return false;
			}
		}
		if (!myStack.isEmpty()) 
			return false;

		return true;
	}

}
