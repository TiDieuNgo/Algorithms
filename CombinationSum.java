package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		int[] candidates = {10,1,2,7,6,1,5};
		combinationSum2(candidates, 8);
	}
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backTracking(list, new ArrayList<>(), 0, candidates, target);
        
        return list;
    }
    
    private static void backTracking(List<List<Integer>> list, List<Integer> tempList,int start, int[] candidates, int target) {
        if (target == 0) 
            list.add(new ArrayList<>(tempList));
        
        if (target > 0) {
            for (int i = target; i < candidates.length; i++) {
                tempList.add(candidates[i]);
                target -= candidates[i];
                backTracking(list, tempList, i + 1, candidates, target);
                tempList.remove(tempList.size() - 1);
                target += candidates[i];
            }
        }
        
    }
}
