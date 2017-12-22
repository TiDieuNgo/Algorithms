package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class checkPerfectNum {
	public static void main(String[] args) {
		String s = "MMMCMXCIX";
		int sum = 0;

		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);


		for (int i = 0; i < s.length() -1; i++) {
			if (map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
				sum -= map.get(s.charAt(i));
			else
				sum += map.get(s.charAt(i));
		}

		//System.out.println(map.get(s.charAt(s.length() - 1)));
		System.out.println(sum + map.get(s.charAt(s.length() - 1)));
	}

}
//30 --- 1  + 2 + 5 + 6  + 10 + 15
//28 --- 1,2,4,7,14