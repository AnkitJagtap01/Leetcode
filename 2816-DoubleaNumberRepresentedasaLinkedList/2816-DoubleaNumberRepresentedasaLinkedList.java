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
    public ListNode doubleIt(ListNode head) {
        if (head == null) return null;

        // Reverse the linked list
        ListNode reversed = reverseList(head);

        ListNode dummy = new ListNode(0);
        ListNode current = reversed, prev = dummy;
        int carry = 0;

        while (current != null) {
            // Calculate doubled value plus any carry
            int doubledValue = current.val * 2 + carry;

            // Update carry for next digit
            carry = doubledValue / 10;

            // Update current node's value
            current.val = doubledValue % 10;

            // Move to the next node
            prev.next = current;
            prev = current;
            current = current.next;
        }

        // Handle remaining carry
        if (carry > 0) {
            prev.next = new ListNode(carry);
        }

        // Reverse the list back to original order with new values
        return reverseList(dummy.next);
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
