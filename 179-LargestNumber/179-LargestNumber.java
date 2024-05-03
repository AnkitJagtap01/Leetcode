        
        // If the largest number is "0", the whole number is zero (edge case)
        if (asStrs[0].equals("0")) {
            return "0";
        }
        
        // Build the largest number from sorted components
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        });
            public int compare(String a, String b) {
        Arrays.sort(asStrs, new Comparator<String>() {
        }
        
        // Sort strings according to custom comparator
    public String largestNumber(int[] nums) {
        // Convert integers to strings for comparison
        String[] asStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            asStrs[i] = String.valueOf(nums[i]);
public class Solution {
        StringBuilder largestNumberStr = new StringBuilder();
        for (String numAsStr : asStrs) {
[
