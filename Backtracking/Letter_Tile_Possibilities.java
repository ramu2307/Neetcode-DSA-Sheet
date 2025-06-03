package Backtracking;

import java.util.Arrays;

public class Letter_Tile_Possibilities {
    
    class Solution {
        public int numTilePossibilities(String tiles) {
            int n = tiles.length();
            char[] ch = tiles.toCharArray();
            Arrays.sort(ch);
            int[] ans = new int[1];
            solve(0, n, new StringBuilder(), ch, new boolean[n], ans);
            return ans[0];
        }

        public void solve(int idx, int n, StringBuilder sb, char[] ch, boolean[] visited, int[] ans) {

            if(sb.length() > 0) {
                ans[0]++;
            }
            for(int i = 0; i < n; i++) {
        
                if(i + 1 < n && (ch[i] == ch[i + 1]) && !visited[i] && !visited[i + 1]) continue;

                if(!visited[i]) {
                    visited[i] = true;
                    sb.append(ch[i]);
                    solve(0, n, sb, ch, visited, ans);
                    sb.deleteCharAt(sb.length() - 1);
                    visited[i] = false;
                }
            }
        }
    }

}
