        
        Solution solution = new Solution();
        List<List<String>> result = solution.groupAnagrams(strs);
        
        System.out.println("Grouped Anagrams:");
        for (List<String> group : result) {
            System.out.println(group);
        }
        
        scanner.close();
    }
}

["eat","tea","tan","ate","nat","bat"]
