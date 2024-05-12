class Solution {
    public int[][] largestLocal(int[][] grid) {
    int n = grid.length;
    int[][] maxLocal = new int[n-2][n-2];
    
    // Iterate through each cell that can be the top-left corner of a 3x3 matrix
    for (int i = 0; i <= n - 3; i++) {
        for (int j = 0; j <= n - 3; j++) {
            // Find the maximum in the 3x3 grid starting at (i, j)
            int maxVal = 0;
            for (int x = i; x < i + 3; x++) {
                for (int y = j; y < j + 3; y++) {
                    maxVal = Math.max(maxVal, grid[x][y]);
                }
            }
            // Set the maximum value in the result matrix
            maxLocal[i][j] = maxVal;
        }
    }
    
    return maxLocal;
}
}
