import java.util.*;

public class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> deads = new HashSet<>(Arrays.asList(deadends)); // Convert deadends to a HashSet
        Set<String> visited = new HashSet<>(); // HashSet to keep track of visited states
        Queue<Node> queue = new LinkedList<>(); // Queue for BFS

        // Early exit if "0000" is in deadends
        if (deads.contains("0000")) {
            return -1;
        }

        // Start BFS with initial state
        queue.offer(new Node("0000", 0));
        visited.add("0000");

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            String state = node.state;
            int depth = node.depth;

            if (state.equals(target)) {
                return depth;
            }

            // Generate all possible states from the current state
            List<String> neighbors = getNeighbors(state);
            for (String neighbor : neighbors) {
                if (!visited.contains(neighbor) && !deads.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(new Node(neighbor, depth + 1));
                }
            }
        }
        
        return -1; // If no solution is found
    }

    // Helper class to store the state along with its depth
    private static class Node {
        String state;
        int depth;

        Node(String state, int depth) {
            this.state = state;
            this.depth = depth;
        }
    }

    // Generates all possible next states for a given lock state
    private List<String> getNeighbors(String state) {
        List<String> neighbors = new ArrayList<>();
        char[] stateArray = state.toCharArray();

        for (int i = 0; i < 4; i++) {
            char oldChar = stateArray[i];
            // Move one step forward
            stateArray[i] = (char) ((oldChar - '0' + 1) % 10 + '0');
            neighbors.add(new String(stateArray));
            // Move one step backward
            stateArray[i] = (char) ((oldChar - '0' + 9) % 10 + '0');
            neighbors.add(new String(stateArray));
            // Restore the original state
            stateArray[i] = oldChar;
        }

        return neighbors;
    }
}
