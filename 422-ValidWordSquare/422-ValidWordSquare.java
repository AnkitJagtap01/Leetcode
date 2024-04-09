public class Solution {
    public boolean validWordSquare(List<String> words) {
        // Iterate over each word in the list
        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.get(i).length(); j++) {
                // Check if the corresponding character in the column exists
                // Also check if it's equal to the character in the row
                if (j >= words.size() || i >= words.get(j).length() || words.get(i).charAt(j) != words.get(j).charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> words = Arrays.asList("abcd", "bnrt", "crmy", "dtye");
        System.out.println(solution.validWordSquare(words)); // Output: true
    }
}
