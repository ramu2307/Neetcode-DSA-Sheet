package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matchsticks_to_Square {
    
    class Solution {
        public boolean makesquare(int[] matchsticks) {
            int n = matchsticks.length;
            Arrays.sort(matchsticks);
            return solve(0, n, new ArrayList<>(), matchsticks);
        }
        public boolean solve(int idx, int n, List<Integer> ans, int[] matchsticks) {

            if(ans.size() > 4) return false;

            if(ans.size() == 4) {
                if(idx == n) {
                    return check(ans);
                }
                return false;
            }
            int sum = 0;
            boolean found = false;
            for(int i = idx; i < n; i++) {
                sum += matchsticks[i];
                ans.add(sum);
                found = found || solve(i + 1, n, ans, matchsticks);
                ans.remove(ans.size() - 1);
            }
            return found;
        }

        public boolean check(List<Integer> ans) {
            int left = 0;
            int right = 3;
            while(left < right) {
                if(ans.get(left) != ans.get(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }

}
