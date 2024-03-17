public class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                merged.append(word1.charAt(i++));
            }
            if (j < word2.length()) {
                merged.append(word2.charAt(j++));
            }
        }
        return merged.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mergeAlternately("abc", "pqr")); // Output: "apbqcr"
        System.out.println(solution.mergeAlternately("ab", "pqrs")); // Output: "apbqrs"
        System.out.println(solution.mergeAlternately("abcd", "pq")); // Output: "apbqcd"
    }
}
