package LeetCode;

import java.util.LinkedList;
import java.util.List;

//import java.util.;

public class WorkBreak {
	public static void main(String[] args) {
		List<String> list = letterCombinations("234");

	}

	 public static List<String> letterCombinations(String digits) {


		 String[] strs = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		    //ArrayList<String> list = new ArrayList<String>();
	        LinkedList<String> q = new LinkedList<>();
	         if(digits.isEmpty()) return q;
	        q.add(" ");

	        for (int i = 0; i < digits.length(); i++) {
	            int digit = digits.charAt(i)-'0'; //3 -> def
	            System.out.print(digit);
	            while (q.peek().length() == i) {
	                String t = q.poll(); //""
	                String str = strs[digit];//abc
	                for (int j = 0; j < str.length(); j++) {
	                    q.add(t+str.charAt(j));
	                }
	            }
	        }

	        return q;
		}

}
