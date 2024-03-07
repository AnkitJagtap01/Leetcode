                pq.poll(); // Removes the lowest score
            }
        }

        // Step 2: Prepare the result array
        int[][] result = new int[map.size()][2];
        int index = 0;
        for (int id : map.keySet()) {
            PriorityQueue<Integer> scores = map.get(id);
            int sum = 0;
            // Sum up the top 5 scores (or fewer if not available) for each student
            while (!scores.isEmpty()) {
                sum += scores.poll(); // Retrieves and removes the head of the queue
            }
            // Calculate the average and fill the result array
            result[index++] = new int[]{id, sum / 5};
        }

        // Sort the result by student ID
        Arrays.sort(result, (a, b) -> Integer.compare(a[0], b[0]));

        return result;
    }

            if (pq.size() > 5) {
            // Ensure the PriorityQueue never holds more than 5 scores
            PriorityQueue<Integer> pq = map.get(item[0]);
            pq.offer(item[1]);
        // Step 1: Group scores by student ID using a PriorityQueue to keep the top 5 scores
        for (int[] item : items) {
            map.putIfAbsent(item[0], new PriorityQueue<>(5));
public class Solution {
    public int[][] highFive(int[][] items) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

import java.util.*;

[[1,91],[1,92],[2,93],[2,97],[1,60],[2,77],[1,65],[1,87],[1,100],[2,100],[2,76]]
