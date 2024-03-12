import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] characters = s.toCharArray();
            Arrays.sort(characters);
            String sorted = new String(characters);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of strings:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline
        
        String[] strs = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strs[i] = scanner.nextLine();
        }
        
        Solution solution = new Solution();
        List<List<String>> result = solution.groupAnagrams(strs);
        
        System.out.println("Grouped Anagrams:");
        for (List<String> group : result) {
            System.out.println(group);
        }
        
        scanner.close();
    }
}
