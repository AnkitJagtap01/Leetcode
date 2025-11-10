func coinChange(coins []int, amount int) int {
    if amount == 0 {
        return 0
    }

    dp := make([]int, amount+1)
    for i := 1; i <= amount; i++ {
        dp[i] = math.MaxInt32
    }

    for _, coin := range coins {
        for i := coin; i <= amount; i++ {
            if dp[i-coin] != math.MaxInt32 {
                dp[i] = min(dp[i], dp[i-coin]+1)
            }

