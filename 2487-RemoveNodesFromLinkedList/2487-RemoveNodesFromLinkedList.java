/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNodes(ListNode head) {
        // Reverse the linked list first
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        
        // Traverse the reversed list and remove nodes
        ListNode dummy = new ListNode(0); // dummy node to handle edge cases smoothly
        dummy.next = head;
        ListNode node = dummy.next;
        int maxVal = Integer.MIN_VALUE;
        prev = dummy; // Reset prev to dummy
        while (node != null) {
            if (node.val >= maxVal) {
                maxVal = node.val;
                prev = node; // Move the prev pointer only if the node is not removed
            } else {
                prev.next = node.next; // Remove the node by skipping it
            }
            node = node.next;
        }
        
        // Reverse the list again to restore the original order
        current = dummy.next;
        prev = null;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev; // Now prev is the new head of the reversed list
    }
}
