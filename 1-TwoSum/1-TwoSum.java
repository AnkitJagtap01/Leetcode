class Solution {
    public int[] twoSum(int[] nums, int target) {
// //   time: O(n^2)      
// //   space: O(1)      
//                 for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[j] == target - nums[i]) {
//                     return new int[] { i, j };
//                 }
//             }
//         }
//         // In case there is no solution, we'll just return null
//         return null;
        
// time: O(n)    
//  space: O(n)       
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int cur = nums[i];
//             cur + x = target
//             x = target - cur
            int x = target - cur;
            if(map.containsKey(x)){
                return new int[] {map.get(x), i};
            }
            map.put(cur,i);
        }
        return null;
        
    }
}
