        for (int i = 0; i < heights.length - 1; i++) {
            int diff = heights[i + 1] - heights[i];
            
            // Only need to consider when the next building is taller
            if (diff > 0) {
                // Use a ladder for this jump
                ladderAllocations.add(diff);
                
                // If we have used more ladders than available
                if (ladderAllocations.size() > ladders) {
                    // Replace the smallest ladder usage with bricks
                    bricks -= ladderAllocations.poll();
        
        PriorityQueue<Integer> ladderAllocations = new PriorityQueue<>();
        // Priority queue to use the largest jumps with ladders
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
// Time Complexity: O(n log k)
                }
                
                // If we run out of bricks, we can't move to the next building
                if (bricks < 0) {
                    return i;

public class Solution {
// Space Complexity: O(k)
[
