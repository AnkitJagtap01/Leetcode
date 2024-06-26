public class Solution {
    public String largestNumber(int[] nums) {
        // Convert integers to strings for comparison
        String[] asStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            asStrs[i] = String.valueOf(nums[i]);
        }
        
        // Sort strings according to custom comparator
        Arrays.sort(asStrs, new Comparator<String>() {
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        });
        
        // If the largest number is "0", the whole number is zero (edge case)
        if (asStrs[0].equals("0")) {
            return "0";
        }
        
        // Build the largest number from sorted components
        StringBuilder largestNumberStr = new StringBuilder();
        for (String numAsStr : asStrs) {
            largestNumberStr.append(numAsStr);
        }
        
        return largestNumberStr.toString();
    }
}
