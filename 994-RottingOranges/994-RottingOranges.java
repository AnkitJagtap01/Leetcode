// // Bruteforce - Time: worse than O((mn)^2) Space: O(m*n)
// // Pseudocode
// while (true) {
//     boolean changed = false;
//     // Scan grid and try to rot neighbors of each rotten orange
//     for each cell in grid {
//         if (cell is rotten) {
//             for each neighbor {
//                 if (neighbor is fresh) {
//                     rot neighbor;
//                     changed = true;
//                 }
//             }
//         }
//     }
//     if (!changed) break; // No new oranges rotted, stop the process
// }


// Time:O(n), Space: O(n)
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) return -1;
        int rows = grid.length, cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0, minutes = 0;
        
        // Initialize the queue with all initially rotten oranges and count fresh oranges
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }
        
        // Directions: up, down, left, right
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        // BFS traversal
        while (!queue.isEmpty() && freshOranges > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] point = queue.poll();
                for (int[] dir : directions) {
                    int x = point[0] + dir[0], y = point[1] + dir[1];
                    if (x >= 0 && x < rows && y >= 0 && y < cols && grid[x][y] == 1) {
                        grid[x][y] = 2; // Turn the orange rotten
                        freshOranges--;
                        queue.offer(new int[]{x, y});
                    }
                }
            }
            minutes++;
        }
        
        return freshOranges == 0 ? minutes : -1;
    }
}
