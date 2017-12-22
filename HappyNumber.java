package LeetCode;

public class HappyNumber {
	public static void main(String[] args) {
		System.out.println("a");
		System.out.print(isHappyNumber(2));
	}
	
	static boolean isHappyNumber(int n) {
		int slow, fast;
		slow = fast = n;

        do{
            slow = squareNumber(slow);
            if (slow == 1) 
                return true;
        }while(slow != n);
        
        return false;
		
	}
	
	static int squareNumber(int n) {
		// n = 19
		int temp = 0;
		int sum = 0;
		
		while (n > 0) {
			temp = n % 10; // 9
			sum += temp * temp;
			n = n/10;
		}
		
		return sum;
	}
}
