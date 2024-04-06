public class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int wordIndex = 0; // Index in the word
        int abbrIndex = 0; // Index in the abbreviation

        while (wordIndex < word.length() && abbrIndex < abbr.length()) {
            if (Character.isDigit(abbr.charAt(abbrIndex))) {
                if (abbr.charAt(abbrIndex) == '0') {
                    return false; // Leading zeros are not allowed
                }
                int val = 0;
                // Build the full number from abbr which represents the skip value
                while (abbrIndex < abbr.length() && Character.isDigit(abbr.charAt(abbrIndex))) {
                    val = val * 10 + (abbr.charAt(abbrIndex) - '0');
                    abbrIndex++;
                }
                wordIndex += val; // Skip the characters in the word
            } else {
                if (word.charAt(wordIndex) != abbr.charAt(abbrIndex)) {
                    return false; // Characters do not match
                }
                wordIndex++;
                abbrIndex++;
            }
        }

        return wordIndex == word.length() && abbrIndex == abbr.length(); // Both strings should be fully traversed
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String word = "internationalization";
        String abbr = "i12iz4n";
        System.out.println(solution.validWordAbbreviation(word, abbr)); // Output: true
    }
}
