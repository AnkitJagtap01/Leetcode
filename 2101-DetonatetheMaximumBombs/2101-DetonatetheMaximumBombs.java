            if (!visited[nextBomb]) {
                count += dfs(nextBomb, graph, visited);
            }
        }
        return count;
    }
    
    // Helper method to check if bomb2 is in range of bomb1
    private boolean inRange(int[] bomb1, int[] bomb2) {
        long dx = bomb1[0] - bomb2[0];
        long dy = bomb1[1] - bomb2[1];
        long squareDistance = dx * dx + dy * dy;
        return squareDistance <= (long) bomb1[2] * bomb1[2];
    }
}

[
