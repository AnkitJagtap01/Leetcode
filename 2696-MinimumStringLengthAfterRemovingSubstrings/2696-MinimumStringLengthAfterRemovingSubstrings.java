class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && ((ch == 'B' && stack.peek() == 'A') || (ch == 'D' && stack.peek() == 'C'))) {
                stack.pop(); // Remove the top of the stack if it forms "AB" or "CD" with ch
            } else {
                stack.push(ch); // Push the current character onto the stack
            }
        }

        return stack.size(); // The size of the stack is the minimum length of the resulting string
    }
}
"
