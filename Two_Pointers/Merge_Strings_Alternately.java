package Two_Pointers;

public class Merge_Strings_Alternately {

    class Solution {
        public String mergeAlternately(String word1, String word2) {
            StringBuilder sb = new StringBuilder();
            int n = word1.length();
            int m = word2.length();
            int idx1 = 0;
            int idx2 = 0;
            while(idx1 < n && idx2 < m) {
                sb.append(word1.charAt(idx1));
                sb.append(word2.charAt(idx2));
                idx1++;
                idx2++;
            }
            while(idx1 < n) {
                sb.append(word1.charAt(idx1));
                idx1++;
            }
            while(idx2 < m) {
                sb.append(word2.charAt(idx2));
                idx2++;
            }
            return sb.toString();
        }
    }
    
}