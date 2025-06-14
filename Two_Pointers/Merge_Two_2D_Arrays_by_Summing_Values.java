package Two_Pointers;

import java.util.ArrayList;
import java.util.List;

public class Merge_Two_2D_Arrays_by_Summing_Values {

    class Solution {
        public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
            List<int[]> ans = new ArrayList<>();
            int n = nums1.length;
            int m = nums2.length;
            int i = 0;
            int j = 0;
            while(i < n && j < m) {
                if(nums1[i][0] == nums2[j][0]) {
                    ans.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                    i++;
                    j++;
                }
                else if(nums1[i][0] < nums2[j][0]) {
                    ans.add(nums1[i]);
                    i++;
                }
                else {
                    ans.add(nums2[j]);
                    j++;
                }
            }

            while(i < n) {
                ans.add(nums1[i]);
                i++;
            }

            while(j < m) {
                ans.add(nums2[j]);
                j++;
            }
            
            return ans.toArray(new int[ans.size()][]);
        }
    }
    
}