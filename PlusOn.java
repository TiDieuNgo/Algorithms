package LeetCode;

public class PlusOn {
	public static void main(String[] args) {
		int[] A = {9,8,7,6,5,4,3,2,1,3};
		plusOne(A);
	}
	
	static int[] plusOne(int[] A){
		String firstString = "";
		int secondNum = 0;
		
		for(int i = 0; i < A.length; i++)
			firstString += A[i];
		
		secondNum = Integer.parseInt(firstString);
		firstString = "" + (secondNum + 1);
		
		int[] result = new int[firstString.length()];	
		for (int i = 0; i < firstString.length(); i++){
			result[i] =  Character.getNumericValue(firstString.charAt(i));
		}
		
		return result;
	}
}
