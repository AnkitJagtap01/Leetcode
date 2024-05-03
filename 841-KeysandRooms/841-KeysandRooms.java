
        // If visitCount matches the number of rooms, we've visited all rooms
        return visitCount[0] == rooms.size();
    }

    private void dfs(List<List<Integer>> rooms, int room, boolean[] visited, int[] visitCount) {
        visited[room] = true;
        visitCount[0]++;
        for (int key : rooms.get(room)) {
            if (!visited[key]) {
                dfs(rooms, key, visited, visitCount);
            }
        }
    }
}

        int[] visitCount = {0}; // Using array to mutate the value inside the DFS method

        // Start DFS from room 0
        dfs(rooms, 0, visited, visitCount);
        boolean[] visited = new boolean[rooms.size()];
public class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
import java.util.*;

[
