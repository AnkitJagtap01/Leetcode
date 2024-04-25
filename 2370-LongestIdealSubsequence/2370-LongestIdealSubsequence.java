                currentMax = Math.max(currentMax, dp[j]);
            }

            // Update dp for the current character to be the maximum found + 1
            dp[index] = currentMax + 1;
            // Update the maximum length found so far
            maxLength = Math.max(maxLength, dp[index]);
        }
        
        return maxLength;
    }
}

            for (int j = Math.max(0, index - k); j <= Math.min(25, index + k); j++) {
            // Loop through all possible characters that can come before 'c' based on k
"
