package Backtracking;
import java.util.*;

public class Word_Break_II {

    class Solution {
        public List<String> wordBreak(String s, List<String> wordDict) {
            List<String> ans = new ArrayList<>();
            solve(0, s, new ArrayList<>(), ans, wordDict);
            return ans;
        }
        public void solve(int idx, String s, List<String> list, List<String> ans, List<String> wordDict) {
    
            if(idx == s.length()) {
                if(!list.isEmpty()) {
                    ans.add(String.join(" ", list));
                }
                return;
            }
    
            for(int i = idx; i < s.length(); i++) {
                String sub = s.substring(idx, i + 1);
                if(wordDict.contains(sub)) {
                    list.add(sub);
                    solve(i + 1, s, list, ans, wordDict);
                    list.remove(list.size() - 1);
                }
            }
        }
    }
    
}