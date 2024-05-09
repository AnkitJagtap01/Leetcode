// Time Complexity: O(n log k)
// Space Complexity: O(k)

public class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        // Priority queue to use the largest jumps with ladders
        PriorityQueue<Integer> ladderAllocations = new PriorityQueue<>();
        
        for (int i = 0; i < heights.length - 1; i++) {
            int diff = heights[i + 1] - heights[i];
            
            // Only need to consider when the next building is taller
            if (diff > 0) {
                // Use a ladder for this jump
                ladderAllocations.add(diff);
                
                // If we have used more ladders than available
                if (ladderAllocations.size() > ladders) {
                    // Replace the smallest ladder usage with bricks
                    bricks -= ladderAllocations.poll();
                }
                
                // If we run out of bricks, we can't move to the next building
                if (bricks < 0) {
                    return i;
                }
            }
        }
        
        return heights.length - 1;
    }
}
