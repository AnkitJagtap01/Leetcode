        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                // Check if mid is the largest integer whose square is <= x
                if (mid + 1 > x / (mid + 1)) {
                    return mid;
                }
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;  // This line is theoretically unreachable because the condition will always return within the loop.
    }
}
4
