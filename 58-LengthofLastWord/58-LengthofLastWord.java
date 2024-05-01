public class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        boolean charFlag = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isLetter(s.charAt(i))) {
                // Start counting the length of the last word
                charFlag = true;
                length++;
            } else {
                // If we have started counting and encounter a space, stop.
                if (charFlag) {
                    return length;
                }
            }
        }
        
        return length;
    }
}
