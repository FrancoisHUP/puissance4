package com.inf5153.game;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// we are going to create a simple 2-players Connect Four implementation in Java 8
public class ConnectFour {

    // we define characters for players (R for Red, Y for Yellow)

    // dimensions for our board
    private final int width, height;
    // grid for the board
    private final char[][] grid;
    // we store last move made by a player
    private int lastCol = -1, lastTop = -1;

    public ConnectFour(int w, int h) {
        width = w;
        height = h;
        grid = new char[h][];

        // init the grid will blank cell
        for (int i = 0; i < h; i++) {
            Arrays.fill(grid[i] = new char[w], '.');
        }
    }

    // we use Streams to make a more concise method
    // for representing the board
    public String toString() {
        return IntStream.range(0, width).
                mapToObj(Integer::toString).
                collect(Collectors.joining()) +
                "\n" +
                Arrays.stream(grid).
                        map(String::new).
                        collect(Collectors.joining("\n"));
    }

    // get string representation of the row containing
    // the last play of the user
    public String horizontal() {
        return new String(grid[lastTop]);
    }

    // get string representation fo the col containing
    // the last play of the user
    public String vertical() {
        StringBuilder sb = new StringBuilder(height);

        for (int h = 0; h < height; h++) {
            sb.append(grid[h][lastCol]);
        }

        return sb.toString();
    }

    // get string representation of the "/" diagonal
    // containing the last play of the user
    public String slashDiagonal() {
        StringBuilder sb = new StringBuilder(height);

        for (int h = 0; h < height; h++) {
            int w = lastCol + lastTop - h;

            if (0 <= w && w < width) {
                sb.append(grid[h][w]);
            }
        }

        return sb.toString();
    }

    // get string representation of the "\"
    // diagonal containing the last play of the user
    public String backslashDiagonal() {
        StringBuilder sb = new StringBuilder(height);

        for (int h = 0; h < height; h++) {
            int w = lastCol - lastTop + h;

            if (0 <= w && w < width) {
                sb.append(grid[h][w]);
            }
        }

        return sb.toString();
    }

    // static method checking if a substring is in str
    public static boolean contains(String str, String substring) {
        return str.indexOf(substring) >= 0;
    }

    // now, we create a method checking if last play is a winning play
    public boolean isWinningPlay() {
        if (lastCol == -1) {
            System.err.println("No move has been made yet");
            return false;
        }

        char sym = grid[lastTop][lastCol];
        // winning streak with the last play symbol
        String streak = String.format("%c%c%c%c", sym, sym, sym, sym);

        // check if streak is in row, col,
        // diagonal or backslash diagonal
        return contains(horizontal(), streak) ||
                contains(vertical(), streak) ||
                contains(slashDiagonal(), streak) ||
                contains(backslashDiagonal(), streak);
    }

    // prompts the user for a column, repeating until a valid choice is made
    public void chooseAndDrop(char symbol, Scanner input) {
        do {
            System.out.println("\nPlayer " + symbol + " turn: ");
            int col = input.nextInt();

            // check if column is ok
            if (!(0 <= col && col < width)) {
                System.out.println("Column must be between 0 and " + (width - 1));
                continue;
            }

            // now we can place the symbol to the first
            // available row in the asked column
            for (int h = height - 1; h >= 0; h--) {
                if (grid[h][col] == '.') {
                    grid[lastTop = h][lastCol = col] = symbol;
                    return;
                }
            }

            // if column is full ==> we need to ask for a new input
            System.out.println("Column " + col + " is full.");
        } while (true);
    }


}