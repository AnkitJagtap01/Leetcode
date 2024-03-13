            if (uf.count() == 1) {
                return log[0];
            }
        }
        
        return -1;
    }
    public int earliestAcq(int[][] logs, int n) {
        Arrays.sort(logs, (a, b) -> Integer.compare(a[0], b[0]));
        
        UnionFind uf = new UnionFind(n);
        
        for (int[] log : logs) {
            uf.union(log[1], log[2]);
import java.util.Arrays;

public class Solution {
[
