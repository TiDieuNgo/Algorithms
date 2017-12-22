package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PalindromePartioning {

	public static void main(String[] args) {

		System.out.println(Math.abs(-1));
		HashMap<Integer, Integer> map = new HashMap<>();
		Set<Integer> set = new HashSet<>();
		//partition("aab");
	}

	public static List<String> partition(String s) {
		List<String> list = new ArrayList<>();
		backTracking(list, new StringBuilder(), s, 0);

		return list;
	}

	private static void backTracking(List<String> list, StringBuilder tempStr, String s, int start) {
		if (isPalindrome(tempStr) && tempStr.length() != 0) {
			list.add(new String(tempStr));
		}

		if (tempStr.length() >= s.length() - start)
			return;

		for (int i = start; i < s.length(); i++) {
			tempStr.append(s.charAt(i));
			backTracking(list, tempStr, s, i + 1);
			tempStr.delete(tempStr.length() - 1, tempStr.length());
		}
	}

	private static boolean isPalindrome(StringBuilder strBuilder) {
		int str = 0;
		int end = strBuilder.length() - 1; // abc
		while (str < end) {
			if (strBuilder.charAt(str++) != strBuilder.charAt(end--))
				return false;
		}

		return true;
	}
}
