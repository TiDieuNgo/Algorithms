package LeetCode;

public class validWordAbbreviation {
	public static void main(String[] argc) {
		String word = "hi";
		String abbr = "2";
		System.out.println(validWordAbbreviation(word, abbr));
	}

	static boolean validWordAbbreviation(String word, String abbr) {
		if (word == null || abbr == null) return false;

		int num = 0;
		int indx = 0;

		for (char c : abbr.toCharArray()) {
			if (Character.isDigit(c)) {
				num = num * 10 + (c - '0');
			}
			else {
				indx += num; num = 0;
				if (indx >= word.length() || word.charAt(indx) != c)
					return false;
				indx++;
			}
		}
		return  num == word.length() - indx ? true : false;
	}
}
