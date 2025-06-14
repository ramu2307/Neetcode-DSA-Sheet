package Two_Pointers;

public class Remove_Duplicates_from_Sorted_Array {
    
    class Solution {
        public int removeDuplicates(int[] nums) {
            int n = nums.length;
            int idx = 1;
            for(int i = 1; i < n; i++) {
                if(nums[i - 1] != nums[i]) {
                    nums[idx++] = nums[i];
                }
            }
            return idx;
        }
    }

}
