package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations_II {

    class Solution {
        public List<List<Integer>> permuteUnique(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);
            List<List<Integer>> ans = new ArrayList<>();
            solve(n, nums, new ArrayList<>(), ans, new boolean[n]);
            return ans;
        }
        public void solve(int n, int[] nums, List<Integer> list, List<List<Integer>> ans, boolean[] visited) {

            if(list.size() == n) {
                ans.add(new ArrayList<>(list));
                return;
            }

            for(int i = 0; i < n; i++) {
                if(i + 1 < n && (nums[i] == nums[i + 1]) && !visited[i] && !visited[i + 1]) continue;

                if(!visited[i]) {
                    visited[i] = true;
                    list.add(nums[i]);
                    solve(n, nums, list, ans, visited);
                    list.remove(list.size() - 1);
                    visited[i] = false;
                }

            }
        }
    }
    
}