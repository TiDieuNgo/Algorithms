package LeetCode;

public class RotateArr {
	public static void main(String[] args){
		int[] arr = {-1};
		rotateArr(arr, 2);
	}
	
	/**
	 * @param nums
	 * @param k
	 */
	static void rotateArr(int[] nums, int k){
		if (k > nums.length)
			k = k - nums.length;
		int[] newArr = new int[nums.length * 2];

        for (int i = 0 ; i < nums.length; i++) {
            newArr[i] = nums[i];
            newArr[i+nums.length] = nums[i];
        }

        int start = nums.length - k;
        int end = start + nums.length ;
        for (int i = start ; i < end; i++) {
        	nums[i-start] = newArr[i];
        	System.out.println(nums[i-start]);
        }
	}
}
