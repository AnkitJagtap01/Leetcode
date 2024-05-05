class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        Set<Integer> occurrences = new HashSet<>();
        
        // Count the frequency of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Check if all frequencies are unique
        for (int count : frequencyMap.values()) {
            if (!occurrences.add(count)) {
                // If add returns false, the count was already in the set, thus it's not unique
                return false;
            }
        }
        
        return true;
    }
}
