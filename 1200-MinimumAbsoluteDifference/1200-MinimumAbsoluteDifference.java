public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        // Sort the array
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        
        // Initialize the minimum difference with a large value
        int minDifference = Integer.MAX_VALUE;
        
        // First pass to find the minimum difference
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff < minDifference) {
                minDifference = diff;
            }
        }
        
        // Second pass to collect all pairs with the minimum difference
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == minDifference) {
                result.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        
        return result;
    }
}
