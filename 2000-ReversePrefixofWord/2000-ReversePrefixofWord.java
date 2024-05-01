public class Solution {
    public String reversePrefix(String word, char ch) {
        // Find the first occurrence of the character ch
        int index = word.indexOf(ch);
        
        // If the character is not found, return the original word
        if (index == -1) return word;
        
        // Reverse the substring from the start to the index of the character ch
        StringBuilder builder = new StringBuilder(word.substring(0, index + 1));
        builder.reverse();
        
        // Append the rest of the word that was not reversed
        builder.append(word.substring(index + 1));
        
        // Return the final string
        return builder.toString();
    }
}

"
