public class Solution {
    public int findRotateSteps(String ring, String key) {
        int n = ring.length(), m = key.length();
        int[][] dp = new int[m + 1][n];

        for (int i = 0; i <= m; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        dp[0][0] = 0; // start from position 0 with 0 cost

        for (int i = 1; i <= m; i++) {
            char ch = key.charAt(i - 1);
            for (int j = 0; j < n; j++) {
                if (ring.charAt(j) == ch) {
                    for (int k = 0; k < n; k++) {
                        if (dp[i - 1][k] < Integer.MAX_VALUE) {
                            int minSteps = Math.min(Math.abs(j - k), n - Math.abs(j - k)) + dp[i - 1][k];
                            dp[i][j] = Math.min(dp[i][j], minSteps + 1); // +1 for pressing the button
                        }
"godding"
