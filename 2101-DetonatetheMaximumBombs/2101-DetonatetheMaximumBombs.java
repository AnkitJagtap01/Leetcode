class Solution {
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        // Build the graph
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && inRange(bombs[i], bombs[j])) {
                    graph.get(i).add(j);
                }
            }
        }
        
        int maxDetonated = 0;
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[n];
            maxDetonated = Math.max(maxDetonated, dfs(i, graph, visited));
        }
        return maxDetonated;
    }
    
    private int dfs(int bomb, List<List<Integer>> graph, boolean[] visited) {
        visited[bomb] = true;
        int count = 1; // The bomb itself
        for (int nextBomb : graph.get(bomb)) {
            if (!visited[nextBomb]) {
                count += dfs(nextBomb, graph, visited);
            }
        }
        return count;
    }
    
    // Helper method to check if bomb2 is in range of bomb1
    private boolean inRange(int[] bomb1, int[] bomb2) {
        long dx = bomb1[0] - bomb2[0];
        long dy = bomb1[1] - bomb2[1];
        long squareDistance = dx * dx + dy * dy;
        return squareDistance <= (long) bomb1[2] * bomb1[2];
    }
}
