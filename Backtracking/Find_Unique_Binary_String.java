package Backtracking;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
public class Find_Unique_Binary_String {

    class Solution {
        public String findDifferentBinaryString(String[] nums) {
            HashSet<String> set = new HashSet<>();
            int n = nums.length;
            for(String s : nums) {
                set.add(s);
            }
            StringBuilder sb = new StringBuilder();
            ArrayList<String> ans = new ArrayList<>();
            solve(n, set, sb, ans);
            return ans.get(0);
        }
        public void solve(int n, HashSet<String> set, StringBuilder sb, List<String> ans) {
    
            if(sb.length() == n) {
                if(!set.contains(sb.toString())) {
                    ans.add(sb.toString());
                }
                return;
            }
            for(int i = 0; i <= 1; i++) {
                if(ans.size() != 0) return;
                sb.append(i);
                solve(n, set, sb, ans);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
    
}