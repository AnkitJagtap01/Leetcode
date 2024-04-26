class Solution {
    public int minFallingPathSum(int[][] grid) {
    int n = grid.length;
    if (n == 1) return grid[0][0];
    
    int[][] dp = new int[n][n];
    System.arraycopy(grid[0], 0, dp[0], 0, n); // Copy first row
    
    for (int i = 1; i < n; i++) {
        // Find the minimum and second minimum values from the previous row
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            if (dp[i-1][j] < min1) {
                min2 = min1;
                min1 = dp[i-1][j];
            } else if (dp[i-1][j] < min2) {
                min2 = dp[i-1][j];
            }
        }
[
