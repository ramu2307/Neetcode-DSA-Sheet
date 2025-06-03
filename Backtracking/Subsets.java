package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            int n = nums.length;
            solve(0, n, nums, new ArrayList<>(), ans);
            return ans;
        }
        public void solve(int idx, int n, int[] nums, List<Integer> list, List<List<Integer>> ans) {

            ans.add(new ArrayList<>(list));
            
            for(int i = idx; i < n; i++) {
                list.add(nums[i]);
                solve(i + 1, n, nums, list, ans);
                list.remove(list.size() - 1);
            }
        }
    }
    
}