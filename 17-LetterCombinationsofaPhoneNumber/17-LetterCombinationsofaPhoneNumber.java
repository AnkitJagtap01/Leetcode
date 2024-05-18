// Time: O(3^N * 4^M); Space: O(3^N * 4^M)
// Iterative solution using Queue implemented as LinkedList

class Solution {
    public List<String> letterCombinations(String digits) {

        LinkedList<String> ans = new LinkedList<String>();
        if(digits.isEmpty()) return ans;
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for(int i=0; i<digits.length(); i++){
            int x = Character.getNumericValue(digits.charAt(i));
            System.out.print("i - ");
            System.out.println(i);
            while(ans.peek().length()==i){
                String t = ans.remove();
                System.out.print("t ");
"23"
