package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class The_k_th_Lexicographical_String_of_All_Happy_Strings_of_Length_n {
    
    class Solution {
        public String getHappyString(int n, int k) {
            List<String> ans = new ArrayList<>();
            solve(n, k, 3, new StringBuilder(), ans, new int[1]);
            return ans.size() == 0 ? "" : ans.get(0);
        }
        public void solve(int n, int k, int prev, StringBuilder sb, List<String> ans, int[] cnt) {


            if(sb.length() == n) {
                cnt[0]++;
                if(cnt[0] == k) {
                    ans.add(sb.toString());
                }
                return;
            }

            for(int i = 0; i <= 2; i++) {
                if(ans.size() != 0) break;
                if(prev == i) continue;
                sb.append((char)('a' + i));
                solve(n, k, i, sb, ans, cnt);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

}
