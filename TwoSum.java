package LeetCode;

import java.util.HashMap;

public class TwoSum {

		public static void main(String[] args){
			int[] nums = {2, 7, 11, 15};
			int t = 9;
			twoSum(nums, t);
		}
		 public static int[] twoSum(int[] nums, int target) {
		        HashMap<Integer, Integer> hm  = new HashMap();
		        int[] result = new int[2];

		        for (int i = 0; i < nums.length; i++)
		            hm.put(nums[i], i);

		        for (int i = 0; i < nums.length; i ++){
		            if (hm.containsKey(target - nums[i]) && i != hm.get(target - nums[i])){
		                result[0] = i;
		                result[1] = hm.get(target - nums[i]);
		                return result;
		            }
		        }
		        return result;
		    }
}
