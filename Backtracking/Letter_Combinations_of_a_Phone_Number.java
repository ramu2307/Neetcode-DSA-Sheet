package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {
    
    class Solution {

        String[] dialpad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        public List<String> letterCombinations(String digits) {
            List<String> ans = new ArrayList<>();
            int n = digits.length();
            if(n == 0) return ans;
            char ch[] = digits.toCharArray();
            solve(0, n, ch, new StringBuilder(), ans);
            return ans;
        }

        public void solve(int idx, int n, char[] ch, StringBuilder sb, List<String> ans) {
            if(idx == n) {
                ans.add(sb.toString());
                return;
            }
            for(int i = 0; i < dialpad[ch[idx] - '0'].length(); i++) {
                sb.append(dialpad[ch[idx] - '0'].charAt(i));
                solve(idx + 1, n, ch, sb, ans);
                sb.deleteCharAt(sb.length() - 1);
            }        
        }
    }

}
