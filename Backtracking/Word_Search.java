package Backtracking;

public class Word_Search {
    
    class Solution {
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    
        public boolean exist(char[][] board, String word) {
            int n = board.length;
            int m = board[0].length;
            boolean[][] visited = new boolean[n][m];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if(board[i][j] == word.charAt(0)) {
                        if(search(n, m, i, j, 1, board, word, visited)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    
        public boolean search(int n, int m, int row, int col, int idx, char[][] board, String word, boolean[][] visited) {
            if(idx == word.length()) {
                return true;
            }
    
            visited[row][col] = true;
            boolean ans = false;
            for(int[] dir : directions) {
    
                int r = row + dir[0];
                int c = col + dir[1];
                if(r >= 0 && r < n && c >= 0 && c < m && !visited[r][c] && (board[r][c] == word.charAt(idx))) {
                    ans = ans || search(n, m, r, c, idx + 1, board, word, visited);
                }
            }
            visited[row][col] = false;
            return ans;
        }
    }

}
