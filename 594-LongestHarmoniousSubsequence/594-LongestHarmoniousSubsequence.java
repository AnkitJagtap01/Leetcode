                Map<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) freq.put(x, freq.getOrDefault(x, 0) + 1);

        int best = 0;
        for (int x : freq.keySet()) {
            if (freq.containsKey(x + 1)) {
                best = Math.max(best, freq.get(x) + freq.get(x + 1));
            }
        }
        return best; // 0 if no pair differs by 1
    }

