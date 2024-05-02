    
    private void buildGraph(TreeNode parent, TreeNode node, Map<Integer, List<Integer>> graph) {
        if (node == null) return;
        graph.putIfAbsent(node.val, new ArrayList<>());
        if (parent != null) {
            graph.get(node.val).add(parent.val);
            graph.get(parent.val).add(node.val);
        }
        buildGraph(node, node.left, graph);
        buildGraph(node, node.right, graph);
    }
}

    }
        return new ArrayList<>();
[
