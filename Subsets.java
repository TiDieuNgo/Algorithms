package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subsets {
	public static void main (String[] args) {
		int[] nums = {4,4,4,1,4};
		List<List<Integer>> lists = findSubsets(nums);
		for (List<Integer> list : lists) {
			for (Integer integer : list) {
				System.out.print(integer + " ");
			}
			System.out.println(" ");
		}
	}

	static List<List<Integer>> findSubsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		//backTracking(list, new ArrayList<>(), nums, 0);
		backTrackingWithoutDuplicate(list, new ArrayList<>(), nums, 0);
		return list;
	}

	static void backTracking(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
		list.add(new ArrayList<Integer> (tempList)); // ban than thang tempList cung la 1 ArrayList ma` sao phai can NEW nhi.
		for (int i = start; i < nums.length; i++) {
			tempList.add(nums[i]);
			backTracking(list, tempList, nums, i + 1);
			tempList.remove(tempList.size() - 1);
		}
	}

	static void backTrackingWithoutDuplicate(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
		//1,1,3,3,3
		list.add(new ArrayList<Integer> (tempList)); // ban than thang tempList cung la 1 ArrayList ma` sao phai can NEW nhi.
		Set<Integer> set = new HashSet<>(); // vi sao set dat ngoai for -> xet cai truong hop de nhat --- [1] [1] [3] [3]

		for (int i = start; i < nums.length; i++) {
			if (!set.contains(nums[i])) {
				tempList.add(nums[i]);
				set.add(nums[i]);
				backTrackingWithoutDuplicate(list, tempList, nums, i + 1);
				tempList.remove(tempList.size() - 1);
			}
		}
	}
}
