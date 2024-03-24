import java.util.*;

public class Solution {
    public int minimumSemesters(int n, int[][] relations) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] inDegree = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] relation : relations) {
            graph.get(relation[0]).add(relation[1]);
            inDegree[relation[1]]++;
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == 0) queue.offer(i);
        }
        
        int semester = 0, count = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int course = queue.poll();
                count++;
                for (int next : graph.get(course)) {
                    inDegree[next]--;
                    if (inDegree[next] == 0) queue.offer(next);
                }
            }
            semester++;
        }
        
        return count == n ? semester : -1;
    }
}
