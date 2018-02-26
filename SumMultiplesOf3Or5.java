package LeetCode;

public class SumMultiplesOf3Or5 {

	/*
	 * For this problem, I need to take care of the case that there are some numbers that can % 3 == 0 and % 5 == 0 in the same time. Such as: 15, 30
	 * So, the thing that I need to do is avoiding double counting those numbers.
	 * There are 2 ways to deal with it as below:
	 * */
	public static void main(String[] args) {
		System.out.println("Way1 : " + countMultiplesOf3Or5_way1());
		System.out.println("Way2 : " + countMultiplesOf3Or5_way2());
	}

	public static int countMultiplesOf3Or5_way1() {
		int res = 0;
		for (int i = 3; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				res += i;
		}
		return res;
	}

	public static int countMultiplesOf3Or5_way2() {
		int res = 0;
		for (int i = 3; i < 1000; i++) {
			if (i % 3 == 0)
				res += i;
			else if (i % 5 == 0) {
				res += i;
			}
		}
		return res;
	}
}

