package org.example.game;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    private static boolean playerSwitch = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Character[][] map = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
        };
        for (int i = 0; i < 9; i++) {
            printMap(map);
            if (playerSwitch) {
                System.out.println("Player 1");
                System.out.println("Choose number and place \"o\"");
                int number = sc.nextInt() - 1;
                while (number < 0 || number > 9 || map[number / 3][number % 3].equals('o') || map[number / 3][number % 3].equals('x')) {
                    System.out.println("Player 1");
                    System.out.println("Choose number and place \"x\"");
                    number = sc.nextInt() - 1;
                }
                map[number / 3][number % 3] = 'o';
                playerSwitch = false;
                if (isGameOver(map)) {
                    for (Character[] subMap : map) {
                        System.out.println(Arrays.deepToString(subMap));
                    }
                    System.out.println("Player 1 won");
                    break;
                }
            } else {
                System.out.println("Player 2");
                System.out.println("Choose number and place \"x\"");
                int number = sc.nextInt() - 1;
                while (number < 0 || number > 9 || map[number / 3][number % 3].equals('o') || map[number / 3][number % 3].equals('x')) {
                    System.out.println("Player 2");
                    System.out.println("Choose number and place \"x\"");
                    number = sc.nextInt() - 1;
                }
                map[number / 3][number % 3] = 'x';
                playerSwitch = true;
                if (isGameOver(map)) {
                    printMap(map);
                    System.out.println("Player 2 won");
                    break;
                }
            }

        }
        System.out.println("Game over");
    }

    private static void printMap(Character[][] map) {
        for (Character[] subMap : map) {
            System.out.println(Arrays.deepToString(subMap));
        }
    }

    public static boolean isGameOver(Character[][] map) {
        //Check rows
        for (Character[] submap : map) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += submap[i];
            }
            if (sum == 360 || sum == 333) {
                return true;
            }

        }
        //check columns
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += map[j][i];
            }
            if (sum == 360 || sum == 333) {
                return true;
            }
        }
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

}