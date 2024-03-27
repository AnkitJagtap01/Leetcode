import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int minAreaRect(int[][] points) {
        Set<String> pointSet = new HashSet<>();
        for (int[] point : points) {
            // Convert each point to a string "x_y" and add it to the set
            pointSet.add(point[0] + "_" + point[1]);
        }
        
        int minArea = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                int[] p1 = points[i];
                int[] p2 = points[j];
                // Check if they form a valid rectangle diagonally
                if (p1[0] != p2[0] && p1[1] != p2[1]) {
                    // Check for the existence of the other two corners
                    if (pointSet.contains(p1[0] + "_" + p2[1]) && pointSet.contains(p2[0] + "_" + p1[1])) {
                        int area = Math.abs(p2[0] - p1[0]) * Math.abs(p2[1] - p1[1]);
                        minArea = Math.min(minArea, area);
                    }
                }
            }
        }
        
        return minArea == Integer.MAX_VALUE ? 0 : minArea;
    }
}
