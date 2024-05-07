class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // Create adjacency list and in-degree array
        List<List<Integer>> adj = new ArrayList<>();
        int[] inDegree = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            adj.get(pre[1]).add(pre[0]);
            inDegree[pre[0]]++;
        }
        
        // Queue for courses with no prerequisites
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }
        
        // Resultant course order
        int[] order = new int[numCourses];
        int index = 0;
        
        // Process the queue
        while (!queue.isEmpty()) {
            int course = queue.poll();
            order[index++] = course;
            for (int nextCourse : adj.get(course)) {
                inDegree[nextCourse]--;
                if (inDegree[nextCourse] == 0) {
                    queue.offer(nextCourse);
                }
            }
        }
        
        // Check if we were able to process all courses
        if (index == numCourses) {
            return order;
        }
        return new int[0];
    }
}
