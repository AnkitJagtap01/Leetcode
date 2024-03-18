class Solution {
    public boolean isPalindrome(String s) {
        // Normalize the string
        String normalized = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        // Check if the normalized string is a palindrome
        int left = 0, right = normalized.length() - 1;
        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        
        return true; // Is a palindrome
    }
"
