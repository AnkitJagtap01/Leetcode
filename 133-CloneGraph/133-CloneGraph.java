    private Map<Node, Node> visited = new HashMap<>();
class Solution {

*/
}
    }

    public Node cloneGraph(Node node) {
        if (node == null) return null;
// DFS Solution
        // If we already cloned this node, return the clone
        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        // Create a new node with the same value
        Node cloneNode = new Node(node.val);
        visited.put(node, cloneNode);

        // Recursively clone neighbors
        for (Node neighbor : node.neighbors) {
            cloneNode.neighbors.add(cloneGraph(neighbor));
        }

