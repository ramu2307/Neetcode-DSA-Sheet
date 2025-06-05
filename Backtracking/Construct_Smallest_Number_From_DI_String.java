package Backtracking;

public class Construct_Smallest_Number_From_DI_String {

    class Solution {
        public String smallestNumber(String pattern) {
            StringBuilder sb = new StringBuilder();
            boolean[] visited = new boolean[9];
            solve(0, pattern, sb, visited);
            return sb.toString();
            
        }
        public boolean solve(int idx, String pattern, StringBuilder sb, boolean[] visited) {
    
            if(sb.length() == pattern.length() + 1) {
                return true;
            }
    
            for(char digit = '1'; digit <= '9'; digit++) {
                if(visited[digit - '1']) continue;
    
                if((sb.length() != 0) && ((pattern.charAt(idx - 1) == 'I' && sb.charAt(sb.length() - 1) >= digit) || (pattern.charAt(idx - 1) == 'D' && sb.charAt(sb.length() - 1) <= digit))) continue;
    
                sb.append(digit);
                visited[digit - '1'] = true;
                if(solve(idx + 1, pattern, sb, visited)) return true;
                visited[digit - '1'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
            return false;
        }
    }
    
}