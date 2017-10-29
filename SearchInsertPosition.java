package LeetCode;

public class SearchInsertPosition {
	public static void main(String[] args) {
		int[] nums = {1,2,5};
		int target = 4;
		searchInsertPos(nums, target);
	}

	static int searchInsertPos(int[] nums, int target) {
		int lo = 0, hi = nums.length - 1;
		
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1 ;
            }
        }
        if (lo == hi && nums[lo] < target) {

            System.out.println(lo + 1);
			return lo + 1;
		}
        System.out.println(lo);
        return lo;
	}
//
//	static int doBSTSearch(int[] nums, int target, int first, int last) {
//		int mid = (first + last) / 2;
//
//		if (nums[mid] == target)
//			return mid;
//		else if (nums[mid] > target && nums[mid - 1] < target)
//			return mid;
//		else if (nums[mid] < target && nums[mid + 1] > target)
//			return mid + 1;
//		else if (nums[mid] < target)
//			return doBSTSearch(nums, target, mid + 1, last);
//		else
//			return doBSTSearch(nums, target, first, mid - 1);
//	}
}
