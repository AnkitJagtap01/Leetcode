public class Solution {
    // Function to reverse bits of a given 32 bits unsigned integer using recursion
    public int reverseBits(int n) {
        return reverseBitsHelper(n, 32, 0);
    }

    // Helper function to perform the recursive bit reversal
    private int reverseBitsHelper(int n, int bitPosition, int result) {
        // Base case: if all 32 bits have been processed
        if (bitPosition == 0) {
            return result;
        }

        // Shift result to the left by 1 to make space for the next bit
        result = (result << 1) | (n & 1);
        
        // Shift n to the right by 1 to process the next bit
        n >>>= 1;
        
        // Recursive call with the next bit position
        return reverseBitsHelper(n, bitPosition - 1, result);
    }
}

00000010100101000001111010011100
