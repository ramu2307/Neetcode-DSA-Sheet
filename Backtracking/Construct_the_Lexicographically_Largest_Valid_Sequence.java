package Backtracking;

public class Construct_the_Lexicographically_Largest_Valid_Sequence {
    
    class Solution {
        public int[] constructDistancedSequence(int n) {
            int m = 2 * n - 1;
            int[] ans = new int[m];
            boolean[] vis = new boolean[n + 1];
            solve(0, n, m, ans, vis);
            return ans;
        }
    
        public boolean solve(int idx, int n, int m, int[] ans, boolean[] vis) {
    
            while(idx < m && ans[idx] != 0) idx++;
    
            if(idx == m) return true;
    
            for(int i = n; i >= 1; i--) {
                if(vis[i]) continue;
    
                if(i == 1) {
                    if(ans[idx] == 0) {
                        ans[idx] = 1;
                        vis[i] = true;
                        if(solve(idx + 1, n, m, ans, vis)) return true;
                        vis[i] = false;
                        ans[idx] = 0;
                    }
                }
                else {
                    int j = idx + i;
                    if(j < m && ans[idx] == 0 && ans[j] == 0) {
                        ans[idx] = ans[j] = i;
                        vis[i] = true;
                        if(solve(idx + 1, n, m, ans, vis)) return true;
                        vis[i] = false;
                        ans[idx] = ans[j] = 0;
                    }
                }
            }
            return false;
        }
    }

}
