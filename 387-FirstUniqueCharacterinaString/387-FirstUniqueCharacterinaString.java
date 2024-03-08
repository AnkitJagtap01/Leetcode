public class Solution {
    public int firstUniqChar(String s) {
        // Array to store frequency of each character, assuming only lowercase English letters
        int[] frequency = new int[26];
        
        // First pass: Count frequencies
        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }
        
        // Second pass: Find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (frequency[s.charAt(i) - 'a'] == 1) {
                return i; // Return the index of the first unique character
            }
        }
        
        return -1; // No unique character found
    }
}

"leetcode"
