        ListNode current = head;
    public ListNode deleteDuplicates(ListNode head) {
        
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Skip the duplicate
                current.next = current.next.next;
class Solution {
 * }
 */

 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 *     ListNode next;
 *     ListNode() {}
 * public class ListNode {
 *     int val;
/**
 * Definition for singly-linked list.
[
