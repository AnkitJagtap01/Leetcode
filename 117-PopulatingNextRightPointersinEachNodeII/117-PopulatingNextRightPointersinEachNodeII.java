/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) return null;

        Node head = null; // head of the next level
        Node prev = null; // the leading node on the next level
        Node current = root; // current node of current level

        while (current != null) {
            // iterate on the current level
            while (current != null) {
                // left child
                if (current.left != null) {
                    if (prev != null) {
                        prev.next = current.left;
                    } else {
                        head = current.left;
                    }
                    prev = current.left;
                }
                // right child
                if (current.right != null) {
                    if (prev != null) {
                        prev.next = current.right;
                    } else {
                        head = current.right;
                    }
                    prev = current.right;
                }
                // move to next node
                current = current.next;
            }

            // move to next level
            current = head;
            head = null;
            prev = null;
        }

        return root;
    }
}
