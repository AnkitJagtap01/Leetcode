class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        Map<Integer, Integer> count = new HashMap<>();  // HashMap to store frequency of each element
        
        for (int num : nums) {
            if (count.containsKey(num)) {
                // If num already exists in map, increment goodPairs by the number of times num has been seen before
                goodPairs += count.get(num);
            }
            // Increment the count of num in the map
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        return goodPairs;
    }
}

[1,2,3,1,1,3]
