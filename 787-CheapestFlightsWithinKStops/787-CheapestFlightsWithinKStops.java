// Bellman Ford Algorithm
// Time: O(K * E) Space: O(N)

public class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] costs = new int[n];
        Arrays.fill(costs, Integer.MAX_VALUE);
        costs[src] = 0;
        
        // Perform k + 1 iterations
        for (int i = 0; i <= k; i++) {
            int[] temp = costs.clone();
            for (int[] flight : flights) {
                int from = flight[0], to = flight[1], price = flight[2];
                if (costs[from] != Integer.MAX_VALUE && costs[from] + price < temp[to]) {
                    temp[to] = costs[from] + price;
                }
            }
            costs = temp;
        }
        
        return costs[dst] == Integer.MAX_VALUE ? -1 : costs[dst];
    }
}
