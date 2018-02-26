package reArrangePosAndNegNumbers;

public class ReArrangeWithoutUsingArray {
	public static void main(String[] args) {
		int[] a = {12, 11, -13, -5, 6, -7, 5, -3, -6};
		reArrange(a);
	}
	private static void reArrange(int[] a){
		int index = 0;
		int temp;
		for(int i = 0; i < a.length; i++){
			if(a[i] < 0){
				temp = a[i];
				for (int j = i; j > index; j--)
					a[j] = a[j-1];
				a[index] = temp; index++;
			}
		}
		printArray(a);
	}
	private static void printArray(int[] a){
		for(int i = 0; i< a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
}
