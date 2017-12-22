package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LongestSub {

	public static void main(String[] args) {
		String s = "abcabcbb";
		int max = 0;
        int idx = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
            	if (map.get(c) >= idx)
            		max = i - map.get(c);
            	else
            		max = i - idx + 1;
                max = idx == 0 ? i : Math.max(max, i - idx + 1);
                idx = idx > map.get(c) ? idx : map.get(c) + 1;
            }
            map.put(c,i);
        }

        System.out.println(Math.max(max, s.length() - idx));
	}
}
