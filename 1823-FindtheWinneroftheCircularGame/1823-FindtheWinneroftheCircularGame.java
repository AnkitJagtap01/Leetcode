class Solution {
    public int findTheWinner(int n, int k) {
        int winner = 0; // Starting with 1 person, the winner is at index 0 (0-indexed)
        for (int i = 2; i <= n; i++) {
            winner = (winner + k) % i;
        }
        return winner + 1; // Converting from 0-indexed to 1-indexed
    }
}


5
