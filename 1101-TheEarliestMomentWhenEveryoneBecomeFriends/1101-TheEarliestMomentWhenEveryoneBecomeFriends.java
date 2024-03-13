import java.util.Arrays;

public class Solution {
    public int earliestAcq(int[][] logs, int n) {
        Arrays.sort(logs, (a, b) -> Integer.compare(a[0], b[0]));
        
        UnionFind uf = new UnionFind(n);
        
        for (int[] log : logs) {
            uf.union(log[1], log[2]);
            if (uf.count() == 1) {
                return log[0];
            }
        }
        
        return -1;
    }

    class UnionFind {
        private int[] root;
        private int[] rank;
        private int count;

        public UnionFind(int size) {
            root = new int[size];
            rank = new int[size];
            count = size;
            for (int i = 0; i < size; i++) {
                root[i] = i;
                rank[i] = 1;
            }
        }

        public int find(int x) {
            if (x == root[x]) {
                return x;
            }
            return root[x] = find(root[x]);
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                if (rank[rootX] > rank[rootY]) {
                    root[rootY] = rootX;
                } else if (rank[rootX] < rank[rootY]) {
                    root[rootX] = rootY;
                } else {
                    root[rootY] = rootX;
                    rank[rootX] += 1;
                }
                count--;
            }
        }

        public int count() {
            return count;
        }
    }

    public static void main(String[] args) {
        // The input would be replaced with user input in a real scenario.
        int[][] logs = {{20190101, 0, 1}, {20190104, 3, 4}, {20190107, 2, 3}, {20190211, 1, 5},
                        {20190224, 2, 4}, {20190301, 0, 3}, {20190312, 1, 2}, {20190322, 4, 5}};
        int n = 6;

        Solution solution = new Solution();
        int result = solution.earliestAcq(logs, n);

        System.out.println("The earliest moment when everyone become friends: " + result);
    }
}
