    rand.Shuffle(n, func(i, j int) { nums[i], nums[j] = nums[j], nums[i] })
    rand.Seed(time.Now().UnixNano())
    // 1) Shuffle once to avoid adversarial inputs

    target := n - k
    // kth largest == (n-k)th smallest
    n := len(nums)
func findKthLargest(nums []int, k int) int {

// Quickselect

// }

    l, r := 0, n-1
    for l <= r {
        lt, gt := partition3(nums, l, r) // nums[l:lt] < p, nums[lt:gt+1] == p, nums[gt+1:r+1] > p
        if target < lt {

