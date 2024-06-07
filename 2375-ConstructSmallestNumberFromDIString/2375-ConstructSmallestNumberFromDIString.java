class Solution {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i <= n; i++) {
            stack.push(i + 1); // Push numbers 1 to n+1 onto the stack
            
            // If we reach the end or the next character is 'I', pop all elements in the stack to result
            if (i == n || pattern.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
            }
        }
        
        return result.toString();
    }
}
