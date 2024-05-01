        // Process each bit from right to left
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert char to integer value
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Convert char to integer value
                j--;
            }
            
            carry = sum > 1 ? 1 : 0; // If sum is 2 or 3, carry should be 1
            result.append(sum % 2);  // Append the least significant bit
        }

        // If there is a leftover carry, append it
        if (carry != 0) {
        int j = b.length() - 1;
        int carry = 0;

public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
"
