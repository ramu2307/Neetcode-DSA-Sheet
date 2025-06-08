package Backtracking;

public class Maximum_Score_Words_Formed_by_Letters {

    class Solution {
        int maxScore;
        public int maxScoreWords(String[] words, char[] letters, int[] score) {
            maxScore = 0;
            int[] freq = new int[26];
            for(char ch : letters) {
                freq[ch - 'a']++;
            }
            solve(0, words, freq, score, 0);
            return maxScore;
        }
        public void solve(int idx, String[] words, int[] freq, int[] score, int points) {
    
            if(idx == words.length) {
                maxScore = Math.max(maxScore, points);
                return;
            }
    
            boolean take = true;
            int currScore = 0;
            String s = words[idx];
            int[] tempFreq = freq.clone();
    
            for(char ch : s.toCharArray()) {
                if(tempFreq[ch - 'a'] > 0) {
                    tempFreq[ch - 'a']--;
                    currScore += score[ch - 'a'];
                }
                else {
                    take = false;
                    break;
                }
            }
            if(take) {
                solve(idx + 1, words, tempFreq, score, points + currScore);
            }
            solve(idx + 1, words, freq, score, points);    
        }
    }
    
}