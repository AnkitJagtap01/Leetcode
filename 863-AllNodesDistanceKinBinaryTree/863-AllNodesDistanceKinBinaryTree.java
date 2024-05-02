/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        // Map to store the undirected graph
        Map<Integer, List<Integer>> graph = new HashMap<>();
        // Build the graph from the tree
        buildGraph(null, root, graph);
        
        // BFS to find all nodes at distance K
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> seen = new HashSet<>();
        queue.offer(target.val);
        seen.add(target.val);
        
        int currentLevel = 0;
        while (!queue.isEmpty()) {
            if (currentLevel == K) {
                return new ArrayList<>(queue);
            }
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int node = queue.poll();
                for (int neighbor : graph.get(node)) {
                    if (seen.add(neighbor)) {
                        queue.offer(neighbor);
                    }
                }
            }
            currentLevel++;
        }
        
        return new ArrayList<>();
    }
    
    private void buildGraph(TreeNode parent, TreeNode node, Map<Integer, List<Integer>> graph) {
        if (node == null) return;
        graph.putIfAbsent(node.val, new ArrayList<>());
        if (parent != null) {
            graph.get(node.val).add(parent.val);
            graph.get(parent.val).add(node.val);
        }
        buildGraph(node, node.left, graph);
        buildGraph(node, node.right, graph);
    }
}
