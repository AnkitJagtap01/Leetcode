                stack.push(current);
                current = current.left;
            }
            
            // Process node
            current = stack.pop();
            result.add(current.val);
            
            // Move to right subtree
            current = current.right;
        }

        return result;
    }
}
            while (current != null) {
            // Push all left children to stack
        while (current != null || !stack.isEmpty()) {

        TreeNode current = root;
[
