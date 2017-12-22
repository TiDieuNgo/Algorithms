package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Penmutation {
	public static void main(String[] arg) {
		String s1 = "ab";
		String s2 = "a";
		System.out.println(isAnagram(s1, s2));

	}

	private static boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;

		int[] A = new int[26];
		for (char c : s.toCharArray())
			A[c - 'a']++;

		for (char c : t.toCharArray()) {
			if (A[c - 'a'] == 0)
				return false;
			else
				A[c - 'a']--;
		}

		return true;
	}

}
