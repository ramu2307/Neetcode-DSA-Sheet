package Backtracking;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;

public class Splitting_a_String_Into_Descending_Consecutive_Values {
    
    class Solution {
        public boolean splitString(String s) {
            int n = s.length();
            return solve(0, n, new ArrayList<>(), s);
        }
        public boolean solve(int idx, int n, List<BigInteger> list, String s) {
    
            if(idx == n) {
                if(list.size() > 1) {
                    for(int i = 1; i < list.size(); i++) {
                        if(list.get(i - 1).subtract(list.get(i)).compareTo(BigInteger.ONE) != 0) return false;
                    }
                    return true;
                }
                return false;
            }
    
            for(int i = idx; i < n; i++) {
                String sub = s.substring(idx, i + 1);
                if(check(sub, list)) {
                    list.add(new BigInteger(sub));
                    if(solve(i + 1, n, list, s)) return true;
                    list.remove(list.size() - 1);
                } 
            }
    
            return false;
        }
    
        public boolean check(String s, List<BigInteger> list) {
        
            BigInteger num = new BigInteger(s);
            if(list.isEmpty() || (list.get(list.size() - 1).subtract(num).compareTo(BigInteger.ONE) == 0)) return true;
    
            return false;
    
        }
    }

}
