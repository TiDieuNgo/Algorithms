package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAnagrams {

	public static void main(String[] args){
		String s= "cbaebabacd";// n = 9
		String p = "abca";
		
		//test------------------
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c : p.toCharArray()){
			map.put(c, map.getOrDefault(c, 0) + 1);
        }
		System.out.println(map.get('a'));
		//---------------
		//findAnagrams(s, p);
	}

	public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        Set set = new HashSet<>();
        int[] fre = new int[26];
        int lengthOfP = p.length();
        int lengthOfS = s.length();

        for (char c : p.toCharArray()){
            set.add(c);
            fre[c - 'a']++;
        }
        

        for(int i = 0; i < lengthOfS; i++) {
        	int[] newFre = fre.clone();

            int n = i + lengthOfP;
            if (n > lengthOfS)
                break;

            if (set.contains(s.charAt(i))) {
                if (isAnagram(i, n, s, newFre))
                    result.add(i);
            }
        }

        for (int i : result) {
			System.out.println(i);
		}
        return result;
    }

    static boolean isAnagram(int start, int end, String s, int[] fre) {
        for (int i = start; i < end; i++){
            char c = s.charAt(i);
            fre[c - 'a']--;

            if (fre[c - 'a'] < 0)
                return false;
        }

        return true;
    }
}
