import java.util.Scanner;

public class Solution {
    // Define an enum for directions
    enum Direction {
        NORTH, EAST, SOUTH, WEST
    }

    public boolean isRobotBounded(String instructions) {
        // Initial position and direction
        int x = 0, y = 0;
        Direction dir = Direction.NORTH;

        for (char instruction : instructions.toCharArray()) {
            switch (instruction) {
                case 'G':
                    switch (dir) {
                        case NORTH: y++; break;
                        case EAST:  x++; break;
                        case SOUTH: y--; break;
                        case WEST:  x--; break;
                    }
                    break;
                case 'L':
                    // Update direction based on current direction
                    dir = switch (dir) {
                        case NORTH -> Direction.WEST;
                        case WEST -> Direction.SOUTH;
                        case SOUTH -> Direction.EAST;
                        case EAST -> Direction.NORTH;
                    };
                    break;
                case 'R':
                    // Update direction based on current direction
                    dir = switch (dir) {
                        case NORTH -> Direction.EAST;
                        case EAST -> Direction.SOUTH;
                        case SOUTH -> Direction.WEST;
                        case WEST -> Direction.NORTH;
                    };
                    break;
            }
        }

        // The robot is bounded in a circle if it returns to the origin
        // or if it doesn't face north direction after one cycle of instructions
        return (x == 0 && y == 0) || (dir != Direction.NORTH);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the robot instructions (G for move forward, L for turn left, R for turn right): ");
        String instructions = scanner.nextLine();

        Solution solution = new Solution();
        boolean result = solution.isRobotBounded(instructions);

        System.out.println("Is the robot bounded in a circle? " + result);

        scanner.close();
    }
}
