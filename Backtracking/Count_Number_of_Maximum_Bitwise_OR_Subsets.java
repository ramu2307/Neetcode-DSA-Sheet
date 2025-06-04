package Backtracking;

public class Count_Number_of_Maximum_Bitwise_OR_Subsets {

    class Solution {
        int maxOR;
        int cnt;
        public int countMaxOrSubsets(int[] nums) {
            int n = nums.length;
            maxOR = 0;
            cnt = 0;
            for(int num : nums) {
                maxOR |= num;
            }
            solve(0, n, 0, nums);
            return cnt;
        }
        public void solve(int idx, int n, int or, int[] nums) {
    
            if(idx == n) {
                if(or == maxOR) {
                    cnt++;
                }
                return;
            }
    
            //take Case
            solve(idx + 1, n, or | nums[idx], nums);
    
            //notTake Case
            solve(idx + 1, n, or, nums);
        }
    }

}