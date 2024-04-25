public class Solution {
    public int longestIdealString(String s, int k) {
        int[] dp = new int[26];  // There are 26 English lowercase letters
        int maxLength = 0;
        
        for (char c : s.toCharArray()) {
            int index = c - 'a';  // Get the index in the alphabet for character c
            int currentMax = 0;

            // Loop through all possible characters that can come before 'c' based on k
            for (int j = Math.max(0, index - k); j <= Math.min(25, index + k); j++) {
                currentMax = Math.max(currentMax, dp[j]);
            }

            // Update dp for the current character to be the maximum found + 1
            dp[index] = currentMax + 1;
            // Update the maximum length found so far
            maxLength = Math.max(maxLength, dp[index]);
        }
        
        return maxLength;
    }
}
