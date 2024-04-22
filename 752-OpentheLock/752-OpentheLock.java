
    public int openLock(String[] deadends, String target) {
        Set<String> deads = new HashSet<>(Arrays.asList(deadends)); // Convert deadends to a HashSet
        Set<String> visited = new HashSet<>(); // HashSet to keep track of visited states
        Queue<Node> queue = new LinkedList<>(); // Queue for BFS

        // Early exit if "0000" is in deadends
        if (deads.contains("0000")) {
            return -1;
        }
import java.util.*;

public class Solution {
        // Start BFS with initial state
        queue.offer(new Node("0000", 0));
        visited.add("0000");

        while (!queue.isEmpty()) {
            Node node = queue.poll();
[
