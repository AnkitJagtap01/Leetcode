class Solution {
    public int countKeyChanges(String s) {
        int keyChanges = 0;

        // Iterate through the string
        for (int i = 1; i < s.length(); i++) {
            // Check if the current character is different from the previous character (ignoring case)
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(i - 1))) {
                keyChanges++;
            }
        }

        return keyChanges;
    }
}
