package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	public static void main(String[] args) {
		int[] nums = {1,0,-1,0,-2,2};
		List<List<Integer>> res = fourSum(nums, 0);
	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList();
        Arrays.sort(nums);

        for (int k2 = nums.length - 1; k2 > 2; k2--) {
        	if (k2 < nums.length - 1 && nums[k2] == nums[k2+1]) continue;
            for (int k1 = k2 - 1; k1 > 1; k1--) {
            	if (k1 < k2 - 1 && nums[k1] == nums[k1+1]) continue;
                twoSum(list, nums, k1, k2, target);
            }
        }
        return list;
    }

    static void twoSum(List<List<Integer>> list, int[] nums, int k1, int k2, int target) {
        int i = 0, j = k1 - 1;
        System.out.println(i + " " + j + " " + k1 + " " + k2);
        int sum = 0;

        while (i < j) {
        	sum = nums[i] + nums[j] + nums[k1] + nums[k2];
            if (sum == target) {
                list.add(Arrays.asList(nums[i], nums[j], nums[k1], nums[k2]));
                while (nums[i+1] == nums[i])
                    i++;
                i++;
                while (nums[j-1] == nums[j])
                    j--;
                j--;
            }
            else if (sum < target) i++;
            else j--;
        }
    }
}
