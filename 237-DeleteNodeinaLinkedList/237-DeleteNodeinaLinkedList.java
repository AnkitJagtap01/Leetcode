/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val; // Copy the value from the next node to the current node.
        node.next = node.next.next; // Unlink the next node from the list.
    }
    
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
