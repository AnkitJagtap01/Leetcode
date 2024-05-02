public class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int totalSatisfied = 0;
        int maxExtraSatisfied = 0;
        int extraSatisfied = 0;

        // Calculate base satisfied customers without using the technique
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                totalSatisfied += customers[i];
            }
        }

        // Using a sliding window to find the best interval to apply the technique
        for (int i = 0; i < n; i++) {
            // If the owner is grumpy at this minute, consider satisfying these customers using the technique
            if (grumpy[i] == 1) {
                extraSatisfied += customers[i];
            }

            // If the window is larger than 'minutes', slide the window
            if (i >= minutes) {
                if (grumpy[i - minutes] == 1) {
                    extraSatisfied -= customers[i - minutes];
                }
            }

            // Update the maximum extra customers that can be satisfied using the technique
            if (i >= minutes - 1) {
                maxExtraSatisfied = Math.max(maxExtraSatisfied, extraSatisfied);
            }
        }

        // Total maximum satisfaction is the base satisfaction plus the best use of the technique
        return totalSatisfied + maxExtraSatisfied;
    }
}
