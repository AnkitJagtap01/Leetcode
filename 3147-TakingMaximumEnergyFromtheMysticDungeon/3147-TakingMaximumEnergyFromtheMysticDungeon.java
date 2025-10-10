    public int maximumEnergy(int[] energy, int k) {
                int n = energy.length;
        long[] dp = new long[n];
        long best = Long.MIN_VALUE;

        for (int i = n - 1; i >= 0; --i) {
            dp[i] = energy[i] + ((i + k < n) ? dp[i + k] : 0);
            if (dp[i] > best) best = dp[i];
        }
        return (int) best;
    }

