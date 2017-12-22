package LeetCode;

public class ReverseWords {
	public static void main (String[] argc) {
		String s = "Let's take LeetCode contest";
		int indx = 0;
        char[] arr = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                // reverse substring
                int start = indx;
                int end = i - 1;
                indx = i+1;

                while (start <= end) {
                    char temp = arr[start];
                    arr[start++] = arr[end];
                    arr[end--] = temp;
                }
            }
        }

        System.out.println(String.valueOf(arr));
	}
}
