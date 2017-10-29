package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Test {

	public static void main(String[] args){

//		String s = "ccbacebabacd";
//		String p = "abc";
//		findAnagrams(s, p);
//		Stack<Integer> ss = new Stack<Integer>();
//		ss.add(1);
		
		System.out.println(4^2^3^3^2);
		
	}

	static int[] findAnagrams(String s, String p){
		int current = 0;
		List<Integer> resultList = new ArrayList<>();
		List<Character> listP = createListP(p);

		if (p.length() > s.length())
			return null;

		for (int i = 0; i < s.length(); i++) {
			char test = s.charAt(i);
			if (listP.contains(test)){
				listP.remove(1);

				if (listP.size() == 0){
					resultList.add(current);
					current++;
					i = current;

					if(s.length() - i < p.length())
						break;
				}
			}
			else {
				current++;
				i = current;

				if(s.length() - i < p.length())
					break;
				listP = createListP(p);
			}
		}

		int[] resultArray = new int[resultList.size()];
		for (int i = 0 ; i < resultList.size(); i++){
			resultArray[i] = resultList.get(i);
		}

		return resultArray;
	}

	private static List<Character> createListP(String p) {
		List<Character> list = new ArrayList<>();

		for (int i = 0; i < p.length(); i++)
			list.add(p.charAt(i));

		return list;
	}
}
