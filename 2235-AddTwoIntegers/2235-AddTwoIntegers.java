class Solution {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test case 1
        int num1 = 12;
        int num2 = 5;
        System.out.println(sol.sum(num1, num2)); // Output: 17
        
        // Test case 2
        int num3 = -10;
        int num4 = 4;
        System.out.println(sol.sum(num3, num4)); // Output: -6
    }
}

