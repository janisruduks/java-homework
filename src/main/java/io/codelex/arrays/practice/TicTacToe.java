package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static final char[][] GAME_BOARD = new char[3][3];
    private static char player = 'X';

    public static void main(String[] args) {
        Scanner keyGAME_BOARD = new Scanner(System.in);
        initBoard();

        while (!getWinner() && !isTie()) {
            System.out.print("'" + player + "' , choose your location  (row, column): ");

            int rowXO = keyGAME_BOARD.nextInt();
            int columnXO = keyGAME_BOARD.nextInt();

            insertXO(rowXO, columnXO);

            displayBoard();
        }

    }

    private static void insertXO(int row, int column) {
        if (isCellFree(row, column)) {
            System.out.println("ERROR: " + row + " " + column + " Place is taken");
        } else {
            GAME_BOARD[row][column] = player;
            playerTurn();
        }
    }

    private static void playerTurn() {
        player = (player == 'X') ? 'O' : 'X';
    }

    private static boolean isCellFree(int row, int column) {
        return GAME_BOARD[row][column] == 'X' || GAME_BOARD[row][column] == 'O';
    }

    private static boolean getWinner() {
        // Diagonals
        if (GAME_BOARD[0][0] == GAME_BOARD[1][1] &&
                GAME_BOARD[1][1] == GAME_BOARD[2][2] && GAME_BOARD[0][0] != '.') {
            System.out.println(GAME_BOARD[0][0] + " won.");
            return true;
        }
        if (GAME_BOARD[0][2] == GAME_BOARD[1][1] &&
                GAME_BOARD[1][1] == GAME_BOARD[2][0] && GAME_BOARD[0][2] != '.') {
            System.out.println(GAME_BOARD[0][2] + " won.");
            return true;
        }
        // Rows
        for (int i = 0; i < 3; i++) {
            if (GAME_BOARD[i][0] == GAME_BOARD[i][1] &&
                    GAME_BOARD[i][1] == GAME_BOARD[i][2] && GAME_BOARD[i][0] != '.') {
                System.out.println(GAME_BOARD[i][0] + " won.");
                return true;
            }
        }
        // Columns
        for (int i = 0; i < 3; i++) {
            if (GAME_BOARD[0][i] == GAME_BOARD[1][i] &&
                    GAME_BOARD[1][i] == GAME_BOARD[2][i] && GAME_BOARD[0][i] != '.') {
                System.out.println(GAME_BOARD[0][i] + " won.");
                return true;
            }
        }
        return false;
    }

    private static boolean isTie() {
        for (char[] cells : GAME_BOARD) {
            for (char cell : cells) {
                if (cell == '.') {
                    return false;
                }
            }
        }
        System.out.println("The game is a tie.");
        return true;
    }

    private static void initBoard() {
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                GAME_BOARD[r][c] = '.';
    }

    private static void displayBoard() {
        System.out.println(" ".repeat(10)
                + " " + GAME_BOARD[0][0] + " " + GAME_BOARD[0][1] + " " + GAME_BOARD[0][2]);
        System.out.println(" ".repeat(10)
                + " " + GAME_BOARD[1][0] + " " + GAME_BOARD[1][1] + " " + GAME_BOARD[1][2]);
        System.out.println(" ".repeat(10)
                + " " + GAME_BOARD[2][0] + " " + GAME_BOARD[2][1] + " " + GAME_BOARD[2][2]);
    }
}