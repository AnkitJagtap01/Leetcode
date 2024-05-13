            return result;
        }
        
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val); // Visit the node
            
            if (node.right != null) {
                stack.push(node.right); // Push right child to stack if it exists
            }
            if (node.left != null) {
                stack.push(node.left); // Push left child to stack if it exists
            }
        }
        
        return result;
    }
}

[
