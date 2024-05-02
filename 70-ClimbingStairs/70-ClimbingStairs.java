class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }

        // Base cases
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        // Fill the dp array
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
2
