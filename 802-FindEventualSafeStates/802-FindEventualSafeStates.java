import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final int UNVISITED = 0, VISITING = 1, SAFE = 2;
    
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] state = new int[n];
        List<Integer> safeNodes = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (dfs(i, graph, state) == SAFE) {
                safeNodes.add(i);
            }
        }
        
        return safeNodes;
    }
    
    private int dfs(int node, int[][] graph, int[] state) {
        if (state[node] != UNVISITED) return state[node];
        
        state[node] = VISITING;
        for (int next : graph[node]) {
            if (state[next] == VISITING || dfs(next, graph, state) != SAFE) {
                return state[node] = UNVISITED; // Not safe
            }
        }
        
        return state[node] = SAFE;
    }
}
