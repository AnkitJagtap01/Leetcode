import java.util.Stack;

class Solution {
    public String reverseParentheses(String s) {
        Stack<String> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                // Reverse the characters between the parentheses
                StringBuilder reversed = new StringBuilder();
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    reversed.append(new StringBuilder(stack.pop()).reverse());
                }
                stack.pop(); // Remove the opening parenthesis '('
                stack.push(reversed.toString()); // Push the reversed substring
            } else {
                // Push the current character as a String
                stack.push(String.valueOf(ch));
            }
        }
        
        // Build the final string from stack components
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(new StringBuilder(stack.pop()).reverse());
        }
        
        return result.reverse().toString();
    }
}

"(abcd)"
