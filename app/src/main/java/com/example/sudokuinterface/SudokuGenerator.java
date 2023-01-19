package com.example.sudokuinterface;


import java.util.Random;

public class SudokuGenerator {
    private static final int SIZE = 9;
    private static int[][] grid = new int[SIZE][SIZE];
    private static Random rand = new Random();

    public static int[][] generate(){
        if (!solve(0, 0)) {
            System.out.println("No solution");
            return new int[0][0];
        }
        removeCells(45);
        return grid;
    }

    private static boolean solve(int row, int col) {
        if (row == SIZE) {
            row = 0;
            if (++col == SIZE) return true;
        }
        if (grid[row][col] != 0) return solve(row+1, col);

        for (int num = 1; num <= SIZE; num++) {
            if (isValid(row, col, num)) {
                grid[row][col] = num;
                if (solve(row+1, col)) return true;
                grid[row][col] = 0;
            }
        }
        return false;
    }

    private static boolean isValid(int row, int col, int num) {
        for (int i = 0; i < SIZE; i++) {
            if (grid[row][i] == num || grid[i][col] == num) return false;
        }
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i + startRow][j + startCol] == num) return false;
            }
        }
        return true;
    }

    private static void removeCells(int n) {
        int count = 0;
        while (count < n) {
            int row = rand.nextInt(SIZE);
            int col = rand.nextInt(SIZE);
            if (grid[row][col] != 0) {
                grid[row][col] = 0;
                count++;
            }
        }
    }
}

