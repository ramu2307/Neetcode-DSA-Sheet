package Graphs;

import java.util.*;
public class Island_Perimeter {

    class Solution {
    
        public int islandPerimeter(int[][] grid) {
            int n = grid.length;
            int m = grid[0].length;
            boolean[][] visited = new boolean[n][m];
            Queue<int[]> q = new ArrayDeque<>();
            for(int i = 0; i < n; i++) {
                boolean find = false;
                for(int j = 0; j < m; j++) {
                    if(grid[i][j] == 1) {
                        q.add(new int[]{i, j});
                        break;
                    }
                }
                if(!q.isEmpty()) break;
            }
            int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
            int peri = 0;
            while(!q.isEmpty()) {
                int[] curr = q.poll();
                int row = curr[0];
                int col = curr[1];
                if(!visited[row][col]) {
                    visited[row][col] = true;
                    for(int[] dir : directions) {
                        int r = row + dir[0];
                        int c = col + dir[1];
                        if(r >= 0 && r < n && c >= 0 && c < m && !visited[r][c] && grid[r][c] == 1) {
                            q.add(new int[]{r, c});
                        }
                        else if(r >= 0 && r < n && c >= 0 && c < m && grid[r][c] == 0) {
                            peri++;
                        }
                        else if(r < 0 || r >= n || c < 0 || c >= m) {
                            peri++;
                        }
                    }
                }
            }
            return peri;
        }
    }
    
}