import java.util.ArrayList;
import java.util.List;

class Solution {
    // Helper method to perform DFS and detect cycles
    private boolean dfs(int course, boolean[] visited, boolean[] recStack, List<List<Integer>> adj) {
        // If the current node is already in the recursion stack, a cycle is detected
        if (recStack[course]) return false;
        // If it's already visited (and not in the recursion stack), no need to explore it again
        if (visited[course]) return true;
        
        // Mark the current node as visited and add it to the recursion stack
        visited[course] = true;
        recStack[course] = true;
        
        // Visit all the adjacent nodes (prerequisites of the current course)
        for (int nextCourse : adj.get(course)) {
2
