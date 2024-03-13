// Bruteforce time: O(n^2) space: O(n)

// public class Solution {
//     public boolean isValid(String s) {
//         int previousLength;
//         do {
//             previousLength = s.length();
//             s = s.replace("()", "").replace("{}", "").replace("[]", "");
//         } while (s.length() != previousLength);
//         return s.isEmpty();
//     }

//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         System.out.println(solution.isValid("()")); // true
//         System.out.println(solution.isValid("()[]{}")); // true
//         System.out.println(solution.isValid("(]")); // false
//     }
// }


import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
"()"
