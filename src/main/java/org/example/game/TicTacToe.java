package org.example.game;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    private static int playerSwitch = 1;

    private Character[][] map;

    private final Scanner sc;

    private boolean gameOver = false;

    TicTacToe() {
        initMap();
        sc = new Scanner(System.in);

    }

    private void initMap() {
        map = new Character[][]{
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
        };

    }

    public static void main(String[] args) {
        TicTacToe ttt = new TicTacToe();
        ttt.startGame();
    }

    public void startGame() {
        for (int i = 0; i < 9; i++) {
            printMap();
            if (playerSwitch == 1) {
                playerMove(playerSwitch);
                if (gameOver) {
                    printMap();
                    System.out.printf("Player %s won\n", playerSwitch);
                    break;
                }

            } else {
                playerMove(playerSwitch);
                if (gameOver) {
                    printMap();
                    System.out.printf("Player %d won\n", playerSwitch);
                    break;
                }
            }

        }
        System.out.println("Game over");
    }

    private void playerMove(int player) {
        System.out.printf("Player %d\n", player);
        System.out.printf("Choose number and place \"%s\"\n", player == 1 ? "x" : "o");
        int number = sc.nextInt() - 1;
        while (number < 0 || number > 9 || map[number / 3][number % 3].equals('o') || map[number / 3][number % 3].equals('x')) {
            System.out.printf("Player %d\n", player);
            System.out.printf("Choose number and place \"%s\"\n", player == 1 ? "x" : "o");
            number = sc.nextInt() - 1;
        }
        map[number / 3][number % 3] = player == 1 ? 'x' : 'o';
        if (isGameOver(map)) return;
        playerSwitch = player == 1 ? 2 : 1;

    }

    private void printMap() {
        for (Character[] subMap : map) {
            System.out.println(Arrays.deepToString(subMap));
        }
    }

    private boolean isGameOver(Character[][] map) {
        if (gameOver) return true;

        if (gameOverRowCheck(map)) {
            gameOver = true;
            return true;
        }
        if (gameOverColumnCheck(map)) {
            gameOver = true;
            return true;
        }

        if (gameOverDiagonalCheck(map)) {
            gameOver = true;
            return true;
        }

        return false;
    }

    private boolean gameOverDiagonalCheck(Character[][] map) {
        int sum = 0;
        int sum2 = 0;
        //Check diagonal
        for (int i = 0; i < 3; i++) {

            sum += map[i][i];
            sum2 += map[i][2 - i];
            if (sum == 360 || sum == 333) {
                return true;
            }
            if (sum2 == 360 || sum2 == 333) {
                return true;
            }
        }
        return false;
    }

    private boolean gameOverColumnCheck(Character[][] map) {
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += map[j][i];
            }
            if (sum == 360 || sum == 333) {
                return true;
            }
        }
        return false;
    }

    private boolean gameOverRowCheck(Character[][] map) {
        for (Character[] submap : map) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += submap[i];
            }
            if (sum == 360 || sum == 333) {
                return true;
            }

        }
        return false;
    }

}