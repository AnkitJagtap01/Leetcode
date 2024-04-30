            if (diff < minDifference) {
                minDifference = diff;
            }
        }
        
        // Second pass to collect all pairs with the minimum difference
        for (int i = 1; i < arr.length; i++) {
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
        
        // First pass to find the minimum difference
        
        // Initialize the minimum difference with a large value
        int minDifference = Integer.MAX_VALUE;
        // Sort the array
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
[
