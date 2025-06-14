package Two_Pointers;

import java.util.Arrays;

public class Minimum_Difference_Between_Highest_and_Lowest_of_K_Scores {

    class Solution {
        public int minimumDifference(int[] nums, int k) {
            Arrays.sort(nums);
            int minDiff = Integer.MAX_VALUE;
            int n = nums.length;
            int start = 0;
            int end = k - 1;
            while(end < n) {
                minDiff = Math.min(minDiff, nums[end] - nums[start]);
                start++;
                end++;
            }
            return minDiff;
        }
    }
    
}