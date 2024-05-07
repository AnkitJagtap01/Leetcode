                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
            if (isPrime[i]) { // Found a prime number
                // Mark all multiples of i as non-prime starting from i^2
        for (int i = 2; i * i < n; i++) {
        
        // Only need to check up to sqrt(n) for marking non-primes
        // 0 and 1 are not prime numbers
        isPrime[0] = isPrime[1] = false;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true); // Assume all numbers are prime initially
        
        if (n <= 2) return 0; // There are no primes less than 2

        // Create a boolean array to track prime numbers
class Solution {
    public int countPrimes(int n) {
1
