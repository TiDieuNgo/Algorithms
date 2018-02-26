package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSUm {
	public static void main(String[] args) {
		int[] nums = {0,0,0};
		threeSum(nums);
	}
	public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        int n = nums.length;
        Arrays.sort(nums);

        for (int k = n-1; k > 1; k--) {
            if (k < n-1 && nums[k] == nums[k+1]) continue;
            findTwoSum(list, nums, k);
        }

        return list;
    }
	// nums : [-4, -1, -1,-1, 0, 1, 2]
	// 			0,  1,  2, 3, 4, 5, 6
    static void findTwoSum(List<List<Integer>> list, int[] nums, int k) {
    	int target = 0 - nums[k]; // 7 -> check a + b = 7 (target)
        int fi = 0;
        int la = k - 1;

        while (fi < la) {
            if (nums[fi] + nums[la] == target) {
                list.add(Arrays.asList(nums[fi], nums[la], nums[k]));
                while (fi < nums.length - 1 && nums[fi] == nums[fi + 1]) {
                	fi++;
                }
                fi++;
            }
            else if (nums[fi] + nums[la] < target)
                fi++;
            else
                la--;
        }
    }
}
