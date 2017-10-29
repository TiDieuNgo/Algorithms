package LeetCode;

public class MaxSubArray {

	public static void main(String[] args){
		int[] A = {-2,1,-3,4,-1,2,1,-5,4};
		maxSubArray(A);
	}
	
	static int maxSubArray(int[] A){
		int[] dp = new int[A.length];
		dp[0] = A[0];
		int max = A[0];
		
		for(int i = 1; i < A.length; i++) {
			if (dp[i-1] <= 0 && A[i] > dp[i-1]) 
				dp[i] = A[i];
			else 
				dp[i] = dp[i-1] + A[i];
			
			if (dp[i] > max)
				max = dp[i];
		}
		System.out.println(max);
		return max;
	}
}
