import java.util.ArrayList;
import java.util.List;

class Solution {
    // Helper method to perform DFS and detect cycles
    private boolean dfs(int course, boolean[] visited, boolean[] recStack, List<List<Integer>> adj) {
        // If the current node is already in the recursion stack, a cycle is detected
        if (recStack[course]) return false;
        // If it's already visited (and not in the recursion stack), no need to explore it again
        if (visited[course]) return true;
        
        // Mark the current node as visited and add it to the recursion stack
        visited[course] = true;
        recStack[course] = true;
        
        // Visit all the adjacent nodes (prerequisites of the current course)
        for (int nextCourse : adj.get(course)) {
            if (!dfs(nextCourse, visited, recStack, adj)) {
                // If any cycle is detected in the DFS, return false
                return false;
            }
        }
        
        // Backtrack: remove the current node from the recursion stack
        recStack[course] = false;
        return true; // No cycle was detected along this path
    }
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Initialize adjacency list to represent the graph
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        // Fill the adjacency list with the prerequisite information
        for (int[] prerequisite : prerequisites) {
            adj.get(prerequisite[1]).add(prerequisite[0]);
        }
        
        // Arrays to keep track of visited courses and the recursion call stack
        boolean[] visited = new boolean[numCourses];
        boolean[] recStack = new boolean[numCourses];
        
        // Perform DFS from each course to detect cycles
        for (int course = 0; course < numCourses; course++) {
            if (!dfs(course, visited, recStack, adj)) {
                // If a cycle is detected, it's impossible to finish all courses
                return false;
            }
        }
        
        // If no cycles are detected, all courses can be finished
        return true;
    }
}
