                case 'R':
                    // Update direction based on current direction
                    dir = switch (dir) {
                        case NORTH -> Direction.EAST;
                        case EAST -> Direction.SOUTH;
                    break;
                    };
                        case WEST -> Direction.SOUTH;
                        case SOUTH -> Direction.EAST;
                        case EAST -> Direction.NORTH;
                    break;
                case 'L':
                    // Update direction based on current direction
                    dir = switch (dir) {
                        case NORTH -> Direction.WEST;
                    switch (dir) {
                        case NORTH: y++; break;
                        case EAST:  x++; break;
                        case SOUTH: y--; break;
                        case WEST:  x--; break;
                    }
        Direction dir = Direction.NORTH;

        for (char instruction : instructions.toCharArray()) {
            switch (instruction) {
                case 'G':
        NORTH, EAST, SOUTH, WEST
    }

    public boolean isRobotBounded(String instructions) {
        // Initial position and direction
        int x = 0, y = 0;
import java.util.Scanner;

public class Solution {
    // Define an enum for directions
    enum Direction {
"GGLLGG"
