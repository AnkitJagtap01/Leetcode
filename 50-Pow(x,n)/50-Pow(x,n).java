// class Solution {
//     public static double myPow(double x, int n) {

//         // Base case 1
//         if(n == 0){
//             return 1;
//         }
//         // Base case 2
//         if(x == 0){
//             return 0;
//         }
//         // Check for the specific case where x is 0 and n is negative to avoid division by zero
//         if (x == 0 && n < 0) {
//             throw new ArithmeticException("Cannot raise 0 to a negative power.");
//         }
//         // Handling the case of n being Integer.MIN_VALUE separately to avoid overflow when negating
//         if (n == Integer.MIN_VALUE) {
//             return (x == 1 || x == -1) ? 1 : 0;
//         }
//         // Handle negative powers by taking the reciprocal of the positive power
//         long N = n; // Convert n to long to handle Integer.MIN_VALUE
//         if (N < 0) {
//             x = 1 / x;
//             N = -N; // Now it's safe to convert N to positive
//         }

//         double half = myPow(x, n / 2);

//         // If n is even, the result is half * half
//         // If n is odd, the result is half * half * x
//         if(n % 2 == 0) {
//             return half * half;
//         } else {
//             return half * half * x;
//         }
//     }

2.00000
