package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Restore_IP_Addresses {
    
    class Solution {
        public List<String> restoreIpAddresses(String s) {
            List<String> ans = new ArrayList<>();
            List<String> temp = new ArrayList<>();
            solve(s, ans, 0, temp);
            return ans;
        }

        public void solve(String s, List<String> ans, int idx, List<String> temp) {

            if(temp.size() > 4) return;

            if(idx == s.length() && temp.size() == 4) {
                ans.add(String.join(".", temp));
                return;
            }

            for(int i = idx; i < s.length(); i++) {
                if(isValid(s.substring(idx, i + 1))) {
                    temp.add(s.substring(idx, i + 1));
                    solve(s, ans, i + 1, temp);
                    temp.remove(temp.size() - 1);
                }
            }
        }

        public boolean isValid(String s) {
            if(s.length() > 3 || (s.length() > 1 && s.charAt(0) == '0')) return false;

            if(Integer.parseInt(s) > 255) return false;

            return true;
        }
    }

}
