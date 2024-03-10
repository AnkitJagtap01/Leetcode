class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Initialize to maximum possible value
        int maxProfit = 0; // Initialize to 0, as the minimum profit possible is 0
        
        for (int price : prices) {
            if (price < minPrice) {
                // Update minPrice to current price if current price is lower
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                // Update maxProfit if selling today yields a better profit
                maxProfit = price - minPrice;
            }
        }
        
        return maxProfit;
    }
}

[7,1,5,3,6,4]
