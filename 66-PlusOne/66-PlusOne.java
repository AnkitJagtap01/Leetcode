public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the array from the last element
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, just increment it and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            // If the digit is 9, it becomes 0 and we carry over 1 to the next left digit
            digits[i] = 0;
        }

        // If all the digits are 9, the result array size increases by 1 with leading 1
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // the rest are initialized to 0 by default in Java
        return newDigits;
    }
}
