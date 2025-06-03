package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {
    
    class Solution {
        public List<List<String>> partition(String s) {
            List<List<String>> ans = new ArrayList<>();
            int n = s.length();
            solve(0, n, s, new ArrayList<>(), ans);
            return ans;
        }
        public void solve(int idx, int n, String s, List<String> list, List<List<String>> ans) {

            if(idx == n) {
                ans.add(new ArrayList<>(list));
                return;
            }

            for(int i = idx; i < n; i++) {
                if(isPalindrome(s, idx, i)) {
                    list.add(s.substring(idx, i + 1));
                    solve(i + 1, n, s, list, ans);
                    list.remove(list.size() - 1);
                }
            }
        }

        public boolean isPalindrome(String s, int left, int right) {
            while(left < right) {
                if(s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }

}
