public class Solution {
    private class UnionFind {
        int[] parent;
        int[] rank;
        int count; // Tracks the number of connected components

        public UnionFind(int n) {
            parent = new int[n];
            rank = new int[n];
            count = n;
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        public boolean union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) return false; // Already connected
            
            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
            count--; // Reduce the number of connected components
            return true;
        }

        public boolean isConnected() {
            return count == 1;
        }
    }

    public int maxNumEdgesToRemove(int n, int[][] edges) {
        UnionFind alice = new UnionFind(n);
        UnionFind bob = new UnionFind(n);
        int totalEdges = 0;
        
        // Process type 3 edges first
        for (int[] edge : edges) {
            if (edge[0] == 3) {
                if (alice.union(edge[1] - 1, edge[2] - 1)) {
                    bob.union(edge[1] - 1, edge[2] - 1); // If added for Alice, also add for Bob
                    totalEdges++;
                }
            }
        }
        
        // Process type 1 and type 2 edges
        for (int[] edge : edges) {
            if (edge[0] == 1) {
                if (alice.union(edge[1] - 1, edge[2] - 1)) {
                    totalEdges++;
                }
            } else if (edge[0] == 2) {
                if (bob.union(edge[1] - 1, edge[2] - 1)) {
                    totalEdges++;
                }
            }
        }
        
        // Check if both Alice and Bob can traverse the entire graph
        if (!alice.isConnected() || !bob.isConnected()) {
            return -1; // Not fully traversable
        }
        
        return edges.length - totalEdges; // Maximum number of edges that can be removed
    }
}
