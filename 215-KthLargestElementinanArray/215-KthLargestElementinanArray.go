//         heap.Push(h, num)
//         if h.Len() > k {
//             heap.Pop(h)
//         }
//     }
//     return (*h)[0]
// }

func findKthLargest(nums []int, k int) int {
    target := len(nums) - k // kth largest == (n-k)th smallest
    l, r := 0, len(nums)-1
    for {
        p := partition(nums, l, r)
        if p == target {
// Quickselect


