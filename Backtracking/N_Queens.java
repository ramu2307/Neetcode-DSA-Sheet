package Backtracking;
import java.util.*;
public class N_Queens {

    class Solution {
        public List<List<String>> solveNQueens(int n) {
            char[][] board = new char[n][n];
            for(int i = 0; i < n; i++) {
                Arrays.fill(board[i], '.');
            }
            List<List<String>> ans = new ArrayList<>();
            solve(0, board, ans);
            return ans;
        }
    
        public void solve(int col, char[][] board, List<List<String>> ans) {
    
            if(col == board.length) {
                ans.add(construct(board));
                return;
            }
    
            for(int row = 0; row < board.length; row++) {
                if(valid(row, col, board)) {
                    board[row][col] = 'Q';
                    solve(col + 1, board, ans);
                    board[row][col] = '.';
                }
            }
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
    
            row = dumRow;
            col = dumCol;
            while(col >= 0 && row < board.length) {
                if(board[row][col] == 'Q') return false;
                row++;
                col--;
            }
    
            return true;
        }
    
        public List<String> construct(char[][] board) {
            List<String> ans = new ArrayList<>();
            for(int i = 0; i < board.length; i++) {
                ans.add(new String(board[i]));
            }
            return ans;
        }
    }
    
}