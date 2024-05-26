class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();
        
        // Add all jewels to the set
        for (char j : jewels.toCharArray()) {
            jewelSet.add(j);
        }
        
        int count = 0;
        
        // Count how many stones are jewels
        for (char s : stones.toCharArray()) {
            if (jewelSet.contains(s)) {
                count++;
            }
        }
        
        return count;
    }
}

"aA"
