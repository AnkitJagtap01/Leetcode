import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> uniqueValues = new HashSet<>();
        
        for (int num : nums) {
            if (num != 0) {
                uniqueValues.add(num);
            }
        }
        
        // The number of operations is the number of unique non-zero values
        return uniqueValues.size();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minimumOperations(new int[]{1, 5, 0, 3, 5})); // Output: 3
        System.out.println(solution.minimumOperations(new int[]{0})); // Output: 0
    }
}
