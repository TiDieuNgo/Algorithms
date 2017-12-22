package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutation {
	public static void main (String[] agrs) {
		int[] nums = {1, 1, 2};
		List<List<Integer>> lists = permuteUnique(nums);


		for (List<Integer> list : lists) {
			for (Integer l : list)

				System.out.print(l + " ");
			System.out.println(" ");
		}
	}

	static List<List<Integer>> permuteUnique(int[] nums)  {
		Set <Integer> set = new HashSet<>();
		Set <List<Integer>> tempListSet = new HashSet<>();


		Arrays.sort(nums);
		List<List<Integer>> list  = new ArrayList<>();
		backTracking(list, new ArrayList<Integer>(), nums, set, tempListSet);
		return list;
	}

	private static void backTracking(List<List<Integer>> list, ArrayList<Integer> tempList, int[] nums, Set<Integer> set, Set <List<Integer>> tempListSet) {
		if (tempList.size() == nums.length ){
			//tempListSet.add(tempList);
			list.add(new ArrayList<>(tempList));
		}

		boolean[] used = new boolean[nums.length];
		for (int i = 0; i < nums.length; i++) {
			//if (tempList.contains(nums[i])) continue;
			if (used[nums[i]]) continue;

			if (!set.contains(i)) {
				used[nums[i]] = true;
				tempList.add(nums[i]);
				set.add(i);
				backTracking(list, tempList, nums, set, tempListSet);
				tempList.remove(tempList.size() - 1);
				set.remove(i);
				//used[nums[i]] = false;
			}
		}
	}
}
