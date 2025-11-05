type IntHeap []int
    h := &IntHeap{}
    heap.Init(h)

    for _, num := range nums {

func findKthLargest(nums []int, k int) int {

func (h IntHeap) Len() int            { return len(h) }
func (h IntHeap) Less(i, j int) bool  { return h[i] < h[j] } // min-heap
func (h IntHeap) Swap(i, j int)       { h[i], h[j] = h[j], h[i] }
func (h *IntHeap) Push(x any)         { *h = append(*h, x.(int)) }
func (h *IntHeap) Pop() any           { old := *h; x := old[len(old)-1]; *h = old[:len(old)-1]; return 
x }
        heap.Push(h, num)

