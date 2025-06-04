package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Split_a_String_Into_the_Max_Number_of_Unique_Substrings {

    class Solution {
        public int maxUniqueSplit(String s) {
            int n = s.length();
            int[] ans = new int[1];
            solve(0, n, s, new ArrayList<>(), ans);
            return ans[0];
        }
        public void solve(int idx, int n, String s, List<String> list, int[] ans) {

            if(idx == n) {
                ans[0] = Math.max(ans[0], list.size());
                return;
            }

            for(int i = idx; i < n; i++) {
                String t = s.substring(idx, i + 1);
                if(list.contains(t)) continue;
                list.add(t);
                solve(i + 1, n, s, list, ans);
                list.remove(list.size() - 1);
            }
        }
    }
    
}