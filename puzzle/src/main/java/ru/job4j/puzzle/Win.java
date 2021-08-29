package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        return (Win.checkRow(board)) || (Win.checkColumn(board)) || (Win.checkDiagonal(board));
    }

    public static boolean checkRow(int[][] board) {
        int success = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    break;
                }
                success++;
                if (success % board.length == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkColumn(int[][] board) {
        int success = 0;
        for (int j = 0; j < board.length; j++) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] == 0) {
                    break;
                }
                success++;
                if (success % board.length == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkDiagonal(int[][] board) {
        int success = 0;
        for (int i = 0; i < board[i].length; i++) {
                if (board[i][i] == 0) {
                    break;
                }
                success++;
            if (success % board.length == 0) {
                return true;
            }
        }
        success = 0;
        for (int i = 0; i < board.length; i++) {
                if (board[i][board.length - 1 - i] == 0) {
                    break;
                }
                success++;
                if (success % board.length == 0) {
                    return true;
                }
        }
        return false;
    }
}
