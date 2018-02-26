package LeetCode;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		int[] nums = {87,6,-100,-19,10,-8,-58,56,14,-1,-42,-45,-17,10,20,-4,13,-17,0,11,-44,65,74,-48,30,-91,13,-53,76,-69,-19,
				-69,16,78,-56,27,41,67,-79,-2,30,-13,-60,39,95,64,-12,45,-52,45,-44,73,97,100,-19,-16,-26,58,-61,53,70,1,-83,11,
				-35,-7,61,30,17,98,29,52,75,-73,-73,-23,-75,91,3,-57,91,50,42,74,-7,62,17,-91,55,94,-21,-36,73,19,-61,-82,73,1,
				-10,-40,11,54,-81,20,40,-29,96,89,57,10,-16,-34,-56,69,76,49,76,82,80,58,-47,12,17,77,-75,-24,11,-45,60,65,55,-89,49,-19,4
				-27};

		System.out.println(threeSumClosest(nums, -275));

	}


	public static int threeSumClosest(int[] nums, int target) {
		int n = nums.length;
		Arrays.sort(nums);
		int res = nums[0] + nums[n - 1] + nums[n - 2];
		for (int k = n - 1; k > 1; k--) {
			if ((k < n - 1) && (nums[k] == nums[k + 1]))
				continue;
			res = twoSum(res, nums, k, target);
			if (res == target) break;
		}

		return res;
	}
	//-5,-4,-3,-2,3 ---- (-1)
	static int twoSum(int res, int[] nums, int k, int target) {
		int left = 0, right = k - 1;
		//int compare = target < 0 ? Math.abs(res + target) :  Math.abs(res - target);
		while (left < right) {
			int sum = nums[left] + nums[right] + nums[k];
			//System.out.println("sum " + sum);
			//System.out.println("compare " + compare);
			//System.out.println("sum - target "+ ( sum - target));
			if (sum == target)
				return sum;
			if (sum > target)
				right--;
			else
				left++;

			 if (Math.abs(sum - target) < Math.abs(res - target)) {
                 res = sum;
             }
			 /*
			if (Math.abs(sum - target) < compare) {
				res = sum;
				compare = target < 0 ? Math.abs(sum + target) :  Math.abs(sum - target);
			}*/
		}

		return res;
	}
}
