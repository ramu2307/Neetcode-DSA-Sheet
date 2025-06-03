package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II {
    
    class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            int n = candidates.length;
            List<List<Integer>> ans = new ArrayList<>();
            solve(0, n, 0, target, candidates, new ArrayList<>(), ans);
            return ans;
        }

        public void solve(int idx, int n, int sum, int target, int[] cand, ArrayList<Integer> list, List<List<Integer>> ans) {

            if(sum == target) {
                ans.add(new ArrayList<>(list));
                return;
            }

            for(int i = idx; i < n; i++) {
                if(i > idx && cand[i] == cand[i - 1]) continue;
                if(sum + cand[i] > target) break;

                list.add(cand[i]);
                solve(i + 1, n, sum + cand[i], target, cand, list, ans);
                list.remove(list.size() - 1);
            }
        }
    }

}
