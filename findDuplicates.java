package LeetCode;

import java.util.HashMap;

public class findDuplicates {
	public static void main(String[] args){
		int[] nums = {};
		findDuplicate(nums);
	}

	private static boolean findDuplicate(int[] nums) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++){
			if (hm.containsKey(nums[i])){
				System.out.print("true");
				return true;
			}
			else 
				hm.put(nums[i], nums[i]);
		}

		System.out.print("F");
		return false;

	}

}
