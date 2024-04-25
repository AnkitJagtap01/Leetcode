public class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        // Also, if the last digit of the number is 0 and it's not 0 itself, it cannot be a palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            int lastDigit = x % 10;
            reversedHalf = reversedHalf * 10 + lastDigit;
            x /= 10;
        }

        // The number is a palindrome if the original number is equal to the reversed number
        // or if the original number is equal to the reversed number without the middle digit (for odd number of digits)
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
