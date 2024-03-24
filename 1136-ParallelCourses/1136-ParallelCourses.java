            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int course = queue.poll();
                count++;
                for (int next : graph.get(course)) {
                    inDegree[next]--;
                    if (inDegree[next] == 0) queue.offer(next);
                }
            }
            semester++;
        }
        
        return count == n ? semester : -1;
    }
}

3
