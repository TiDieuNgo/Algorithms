package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {

//		List<List<Integer>> lists = null;
//		lists.size();
//		for (int i = 0; i < lists.size(); i++) {
//			lists.get(i).get(0);
//		}
		int min = Integer.MAX_VALUE; int iMin = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE; int iMax = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;

		int[][] lists = {{4,5},{4,5},{1, 4,6,29}};
		for (int i = 0; i < lists.length; i++) {
			if (lists[i][0] <= min) {
				min = lists[i][0];
				iMin = i;
			}
			if (lists[i][lists[i].length -1] >= max) {
				max = lists[i][lists[i].length -1];
				iMax = i;
			}
		}

		for (int i = 0; i < lists.length; i++) {
			if (lists[i][0] <= min2 && i != iMin)
				min2 = lists[i][0];
			if (lists[i][lists[i].length -1] >= max2 && i != iMax)
				max2 = lists[i][lists[i].length -1];
		}

		if (iMin == iMax) {
			System.out.println(max - min2 > max2 - min ? max - min2 : max2 - min );
		}
		else
			System.out.println(max - min);
	}
}