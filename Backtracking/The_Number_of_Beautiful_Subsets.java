package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class The_Number_of_Beautiful_Subsets {
    
    class Solution {
        public int beautifulSubsets(int[] nums, int k) {
            int[] ans = new int[1];
            int n = nums.length;
            solve(0, n, nums, new ArrayList<>(), ans, k);
            return ans[0] - 1;  // subtract 1 to exclude the empty subset
        }

        public void solve(int idx, int n, int[] nums, List<Integer> list, int[] ans, int k) {
            ans[0]++;  // count the current subset (including empty subset)

            for (int i = idx; i < n; i++) {
                if (canAdd(nums[i], list, k)) {
                    list.add(nums[i]);
                    solve(i + 1, n, nums, list, ans, k);
                    list.remove(list.size() - 1);
                }
            }
        }

        private boolean canAdd(int candidate, List<Integer> list, int k) {
            for (int num : list) {
                if (Math.abs(num - candidate) == k) return false;
            }
            return true;
        }
    }

}
