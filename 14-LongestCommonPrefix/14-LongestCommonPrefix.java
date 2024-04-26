public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start by assuming the whole first string is the common prefix
        String prefix = strs[0];

        // Compare the prefix with each string
        for (int i = 1; i < strs.length; i++) {
            // Reduce the prefix length until it matches the start of the current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return ""; // If no common prefix, return empty string
                }
            }
        }

        return prefix;
    }
}
