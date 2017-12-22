package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation2 {

	public static void main(String[] args) {
		int[] nums = {1,1,2};
		permuteUnique(nums);
	}
	public static List<List<Integer>> permuteUnique(int[] nums)  {
        boolean[] used = new boolean[nums.length + 1];
		//Set <List<Integer>> tempListSet = new HashSet<>();
		Arrays.sort(nums);
		List<List<Integer>> list  = new ArrayList<>();
		backTracking(list, new ArrayList<Integer>(), nums, used);
		return list;
	}

	private static void backTracking(List<List<Integer>> list, ArrayList<Integer> tempList, int[] nums,  boolean[] used) {
		if (tempList.size() == nums.length ){
			list.add(new ArrayList<>(tempList));
		}
        //boolean[] used2 = new boolean[1000];
        
		for (int i = 0; i < nums.length; i++) {
            if(i>0 &&nums[i-1]==nums[i] && !used[i-1]) continue;
            //if (i > 0 && nums[i] == nums[i-1]) return;
			if (used[i] == false) {
				tempList.add(nums[i]);
				used[i] = true;
				backTracking(list, tempList, nums, used);
				tempList.remove(tempList.size() - 1);
				used[i] = false;
			}
		}
	}
}
