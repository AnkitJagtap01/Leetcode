public class Solution {
    public boolean isReflected(int[][] points) {
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        Set<String> pointSet = new HashSet<>();

        // Calculate minX, maxX and fill the set with string representations of points
        for (int[] point : points) {
            minX = Math.min(minX, point[0]);
            maxX = Math.max(maxX, point[0]);
            String str = point[0] + "," + point[1];
            pointSet.add(str);
        }

        int sum = minX + maxX;

        // Check each point for its symmetric counterpart
        for (int[] point : points) {
            String reflected = (sum - point[0]) + "," + point[1];
            if (!pointSet.contains(reflected)) {
                return false;
            }
        }

        return true;
    }
}
