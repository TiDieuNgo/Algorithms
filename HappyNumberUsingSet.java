package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumberUsingSet {
	public static void main(String[] argc) {
		System.out.print(isHappyNumber(19));
	}
	
	static boolean isHappyNumber(int n) {
		Set<Integer> set = new HashSet<>();
		boolean flag = true;
		while(flag) {
			n = squareNumber(n);
			if(n == 1) 
				return true;
			flag = set.add(n);
		}
		
		return false;
	}
	
	static int squareNumber(int n) {
		// n = 19
		int temp = 0;
		int sum = 0;
		
		while (n > 0) {
			temp = n % 10; // 9
			sum += temp * temp;
			n = n/10;
		}
		
		return sum;
	}

}
