public class Solution {
    private List<List<Integer>> bridges;
    private List<Integer>[] graph;
    private int[] disc, low;
    private int time;

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        // Initialize
        bridges = new ArrayList<>();
        graph = new List[n];
        disc = new int[n];
        low = new int[n];
        time = 0;
        Arrays.fill(disc, -1); // -1 indicates unvisited

        // Build the graph
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (List<Integer> conn : connections) {
            graph[conn.get(0)].add(conn.get(1));
            graph[conn.get(1)].add(conn.get(0));
        }

        // DFS to find critical connections
        for (int i = 0; i < n; i++) {
            if (disc[i] == -1) {
                dfs(i, i);
            }
        }
        return bridges;
    }

    private void dfs(int u, int parent) {
        disc[u] = low[u] = ++time;
        for (int v : graph[u]) {
            if (v == parent) {
                continue; // Skip the parent
            }
            if (disc[v] == -1) { // If v is not visited
                dfs(v, u);
                low[u] = Math.min(low[u], low[v]);
                if (low[v] > disc[u]) {
                    bridges.add(Arrays.asList(u, v));
                }
            } else { // Back edge
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }
}
