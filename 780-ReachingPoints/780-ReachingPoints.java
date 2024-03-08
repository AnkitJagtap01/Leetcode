import java.util.Scanner;

public class Solution {
    public static boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (tx >= sx && ty >= sy) {
            if (tx == sx && ty == sy) {
                return true; // Reached the starting point
            }
            if (tx > ty) {
                if (ty > sy) tx %= ty; // Reduce tx while keeping ty constant
                else return (tx - sx) % ty == 0; // Check if we can reach sx by reducing tx in steps of ty
            } else {
                if (tx > sx) ty %= tx; // Reduce ty while keeping tx constant
                else return (ty - sy) % tx == 0; // Check if we can reach sy by reducing ty in steps of tx
            }
        }
        return false; // Could not reach the starting point
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter starting point sx, sy:");
        int sx = scanner.nextInt();
        int sy = scanner.nextInt();

        System.out.println("Enter target point tx, ty:");
        int tx = scanner.nextInt();
        int ty = scanner.nextInt();

        boolean result = reachingPoints(sx, sy, tx, ty);
        System.out.println("Is it possible to reach the target point? " + result);

        scanner.close();
    }
}

1
