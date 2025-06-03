package Backtracking;

public class Sum_of_All_Subset_XOR_Totals {

    class Solution {
        public int subsetXORSum(int[] nums) {
            int n = nums.length;
            return solve(0, n, 0, nums);
        }
    
        public int solve(int idx, int n, int xor, int[] nums) {
            
            if(idx == n) {
                return xor;
            }
    
            int take = solve(idx + 1, n, xor ^ nums[idx], nums);
            int notTake = solve(idx + 1, n,  xor, nums);
    
            return take + notTake;
        }
    
    }

}