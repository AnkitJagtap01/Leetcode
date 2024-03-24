        
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] state = new int[n];
        List<Integer> safeNodes = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (dfs(i, graph, state) == SAFE) {
                safeNodes.add(i);
            }
        }
import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final int UNVISITED = 0, VISITING = 1, SAFE = 2;
    
[
