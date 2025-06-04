package Backtracking;

import java.util.Arrays;

public class Partition_to_K_Equal_Sum_Subsets {

    class Solution {
        public boolean canPartitionKSubsets(int[] nums, int k) {
            int n = nums.length;
            int totalSum = 0;
            for(int num : nums) {
                totalSum += num;
            }
            Arrays.sort(nums);
            reverse(nums);
            if(totalSum % k != 0) return false;
            int target = totalSum / k;
            if(nums[0] > target) return false;
            int[] ans = new int[k];
            return solve(0, n, nums, k, target, ans);
        }
        public boolean solve(int idx, int n, int[] nums, int k, int target, int[] ans) {

            if(idx == n) {
                for(int num : ans) {
                    if(num != target) return false;
                }
                return true;
            }

            for(int i = 0; i < k; i++) {
                if(ans[i] + nums[idx] <= target) {
                    ans[i] += nums[idx];
                    if(solve(idx + 1, n, nums, k, target, ans)) return true;
                    ans[i] -= nums[idx];
                }

                if(ans[i] == 0) break;
            }
            return false;
        }

        public void reverse(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            while(left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
    }

}