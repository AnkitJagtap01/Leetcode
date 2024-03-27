    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {

    private int time;
    private int[] disc, low;
    private List<Integer>[] graph;
    private List<List<Integer>> bridges;
public class Solution {
        // Initialize
        bridges = new ArrayList<>();
        graph = new List[n];
        disc = new int[n];
        low = new int[n];
        time = 0;
        Arrays.fill(disc, -1); // -1 indicates unvisited

        // Build the graph
        for (int i = 0; i < n; i++) {
4
