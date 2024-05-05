            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Check if all frequencies are unique
        for (int count : frequencyMap.values()) {
            if (!occurrences.add(count)) {
                // If add returns false, the count was already in the set, thus it's not unique
                return false;
            }
        }
        
        return true;
        for (int num : arr) {
        // Count the frequency of each element
        Set<Integer> occurrences = new HashSet<>();
        
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
class Solution {
[
