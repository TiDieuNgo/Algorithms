package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {

	public static void main(String[] args) {
		letterCombinations("234");
	}

	public static List<String> letterCombinations(String digits) {
		// digits = 234;
		// arr[2,3,4];

		String[] strs = new String[10];
		strs[1] = "";
		strs[2] = "abc";
		strs[3] = "def";
		strs[4] = "ghi";
		strs[5] = "jkl";
		strs[6] = "mno";
		strs[7] = "pqrs";
		strs[8] = "tuv";
		strs[9] = "wxyz";

		List<String> list = new ArrayList<>();
		backTracking(list, new StringBuilder(), 0, strs, digits);

		return list;
	}

	private static void backTracking(List<String> list, StringBuilder tempStr, int start, String[] strs, String digits) {
		// digits = 234;
		// arr[2,3,4]; // ["abc", "def", "ghi"]
		//for (int i = 0; i < tempStr.length(); i ++)
		if (tempStr.length() == digits.length()){
			list.add(new String(tempStr));
			return;
		}
		for (int i = start; i < digits.length(); i++) {
			int index = digits.charAt(i) - '0';
			String str = strs[index];// "abc", "def", "ghi"
			for (int j = 0; j < str.length(); j++) {
				tempStr.append(str.charAt(j));
				backTracking(list, tempStr, i + 1, strs, digits);
				tempStr.delete(tempStr.length() - 1, tempStr.length());
			}

		}

	}
}
