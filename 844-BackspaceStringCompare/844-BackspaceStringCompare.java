class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1;
        
        while (i >= 0 || j >= 0) {
            int backCountS = 0, backCountT = 0;
            
            // Adjust i for backspaces in s
            while (i >= 0 && (backCountS > 0 || s.charAt(i) == '#')) {
                backCountS += s.charAt(i) == '#' ? 1 : -1;
                i--;
            }
            
            // Adjust j for backspaces in t
            while (j >= 0 && (backCountT > 0 || t.charAt(j) == '#')) {
                backCountT += t.charAt(j) == '#' ? 1 : -1;
                j--;
            }
            
            // Compare characters
            if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) {
                return false;
            }
            
            // If one string is finished, and the other isn't
            if ((i >= 0) != (j >= 0)) {
                return false;
            }
            
            i--;
            j--;
        }
        
        return true;
    }
}
