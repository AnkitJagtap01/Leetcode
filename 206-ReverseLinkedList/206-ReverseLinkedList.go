 * }
 */
func reverseList(head *ListNode) *ListNode {
    var prev *ListNode
    curr := head

    for curr != nil {
        next := curr.Next   // store next node
        curr.Next = prev    // reverse the link
        prev = curr         // move prev forward
        curr = next         // move curr forward
    }

    return prev
}

