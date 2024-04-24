        
        // Variable to hold the next Tribonacci number
        int nextValue = 0;
        
        // Calculate the sequence from T3 to Tn
        for (int i = 3; i <= n; i++) {
            nextValue = a + b + c;
            a = b;
            b = c;
            c = nextValue;
        }
        int a = 0, b = 1, c = 1;
        // Initial values for T0, T1, T2
        
        if (n == 1 || n == 2) return 1;
        // Base cases
        if (n == 0) return 0;
class Solution {
    public int tribonacci(int n) {
4
