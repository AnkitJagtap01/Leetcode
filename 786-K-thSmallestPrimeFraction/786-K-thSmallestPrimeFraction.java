public class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        // Priority queue to sort based on the value of the fractions
        PriorityQueue<int[]> heap = new PriorityQueue<>(
            (a, b) -> Double.compare(arr[a[0]] / (double) arr[a[1]], arr[b[0]] / (double) arr[b[1]])
        );
        
        // Initialize the heap with fractions of the form arr[i] / arr[n-1]
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            heap.add(new int[]{i, n - 1});
        }
        
        // Process the heap to find the k-th smallest fraction
        for (int count = 1; count < k; count++) {
            int[] fraction = heap.poll();
            int i = fraction[0];
            int j = fraction[1];
            
            // If possible, push the next fraction with the same numerator but the next smaller denominator
            if (j - 1 > i) {
                heap.add(new int[]{i, j - 1});
            }
        }
        
[
