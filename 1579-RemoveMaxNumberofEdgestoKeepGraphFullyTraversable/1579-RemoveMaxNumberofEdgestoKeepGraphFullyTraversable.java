public class Solution {
    private class UnionFind {
        int[] parent;
        int[] rank;
        int count; // Tracks the number of connected components

        public UnionFind(int n) {
            parent = new int[n];
            rank = new int[n];
            count = n;
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            if (parent[x] != x) {
4
