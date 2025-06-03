package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    
    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            int n = nums.length;
            solve(0, n, nums, new ArrayList<>(), ans, new boolean[n]);
            return ans;
        }
        public void solve(int idx, int n, int[] nums, List<Integer> list, List<List<Integer>> ans, boolean[] visited) {
            
            if(list.size() == n) {
                ans.add(new ArrayList<>(list));
                return;
            }

            for(int i = idx; i < n; i++) {
                if(!visited[i]) {
                    visited[i] = true;
                    list.add(nums[i]);
                    solve(0, n, nums, list, ans, visited);
                    list.remove(list.size() - 1);
                    visited[i] = false;
                }
            }
        }
    }

}
