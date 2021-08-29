package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if ((Win.checkRow(board, i)) || (Win.checkColumn(board, i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkRow(int[][] board, int row) {
        boolean rsl = true;
            for (int i = 0; i < board.length; i++) {
                if (board[row][i] != 1) {
                    rsl = false;
                    break;
                }
            }
        return rsl;
    }

    public static boolean checkColumn(int[][] board, int column) {
        boolean rsl = true;
            for (int i = 0; i < board.length; i++) {
                if (board[i][column] != 1) {
                    rsl = false;
                    break;
                }
            }
        return rsl;
    }

}
