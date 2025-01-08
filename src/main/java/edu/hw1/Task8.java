package edu.hw1;

public class Task8 {
    private Task8() {

    }

    private static final int[][] KNIGHT_MOVES = {{-2, 1}, {-1, 2}, {1, 2}, {2, 1},
        {2, -1}, {1, -2}, {-1, -2}, {-2, -1}};

    public static boolean knightBoardCapture(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 1) {
                    for (int[] move : KNIGHT_MOVES) {
                        int newRow = i + move[0];
                        int newCol = j + move[1];
                        if (isValid(newRow, newCol, rows, cols) && board[newRow][newCol] == 1) {
                            return false; // Найдены два коня, атакующих друг друга
                        }
                    }
                }
            }
        }
        return true;
    }

    private static boolean isValid(int row, int col, int rows, int cols) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }
}
