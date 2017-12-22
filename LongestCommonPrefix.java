package LeetCode;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] strs = {"aa","a"};
		System.out.println(longestCommonPrefix(strs));
	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "";

		for (int j = 0; j < strs[0].length(); j++) {
			char c = strs[0].charAt(j);

			for (int i = 0; i < strs.length ; i++) {
				if ( strs[i].length() == j || strs[i].charAt(j) != c )
					return strs[0].substring(0, j);
			}
		}

		
        return strs[0];
    }
}
