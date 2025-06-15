package Graphs;

public class Find_Champion_II {

    class Solution {
        public int findChampion(int n, int[][] edges) {
            int[] in_degree = new int[n];
            for(int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                in_degree[v]++;
            }
    
            int noParentCnt = 0;
            int ans = -1;
            for(int i = 0; i < n; i++) {
                if(in_degree[i] == 0) {
                    noParentCnt++;
                    ans = i;
                }
            }
    
            if(noParentCnt > 1) {
                return -1;
            }
            return ans;
        }
    }
    
}
