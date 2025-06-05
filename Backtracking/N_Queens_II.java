package Backtracking;
import java.util.*;

public class N_Queens_II {

    class Solution {
        public int totalNQueens(int n) {
            char[][] board = new char[n][n];
            for(int i = 0; i < n; i++) {
                Arrays.fill(board[i], '.');
            }
            return solve(0, board);
        }
        public int solve(int col, char[][] board) {
    
            if(col == board.length) {
                return 1;
            }
    
            int ans = 0;
            for(int row = 0; row < board.length; row++) {
                if(valid(row, col, board)) {
                    board[row][col] = 'Q';
                    ans += solve(col + 1, board);
                    board[row][col] = '.';
                }
            }
            return ans;
        }
    
        public boolean valid(int row, int col, char[][] board) {
    
            int dumRow = row;
            int dumCol = col;
            while(row >= 0 && col >= 0) {
                if(board[row][col] == 'Q') return false;
                row--;
                col--;
            }
    
            row = dumRow;
            col = dumCol;
            while(col >= 0) {
                if(board[row][col] == 'Q') return false;
                col--;
            }
    
            col = dumCol;
            while(col >= 0 && row < board.length) {
                if(board[row][col] == 'Q') return false;
                row++;
                col--;
            }
    
            return true;
        }
    }
    
}