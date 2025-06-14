package Two_Pointers;

public class Merge_Sorted_Array {

    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int j = n - 1;
            int i = m - 1;
            int idx = nums1.length - 1;
            while(i >= 0 && j >= 0) {
                if(nums2[j] > nums1[i]) {
                    nums1[idx] = nums2[j];
                    j--; 
                }
                else {
                    nums1[idx] = nums1[i];
                    i--;
                }
                idx--;
            }
            while(j >= 0) {
                nums1[idx--] = nums2[j--];
            }
        }
    }
    
}