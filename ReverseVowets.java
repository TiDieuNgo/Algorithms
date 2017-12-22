package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowets {
	public static void main (String[] args) {

		boolean[] marked = new boolean[256];

        marked['u'] = true;
        marked['e'] = true;
        marked['o'] = true;
        marked['a'] = true;
        marked['i'] = true;
        marked['U'] = true;
        marked['E'] = true;
        marked['O'] = true;
        marked['A'] = true;
        marked['I'] = true;

        String s = "ab";
        char[] arr = s.toCharArray();
        for (int i = 0, j = s.length() - 1; i < j; i++) {
            if (marked[arr[i]] == true) {
                for (; j > i; j--) {
                    if (marked[arr[j]] == true) {
                        char temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;

                        j--;
                        break;
                    }
                }
            }
        }

        return String.valueOf(arr);
	}
}
