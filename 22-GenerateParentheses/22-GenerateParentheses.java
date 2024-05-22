            backtrack(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n1 = 3;
        System.out.println(sol.generateParenthesis(n1));
        // Output: ["((()))","(()())","(())()","()(())","()()()"]

        int n2 = 1;
        System.out.println(sol.generateParenthesis(n2));
        // Output: ["()"]
    }
}

3
