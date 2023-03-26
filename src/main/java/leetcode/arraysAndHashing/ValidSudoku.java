package leetcode.arraysAndHashing;

import java.util.HashSet;
import java.util.Set;


public class ValidSudoku {
    /**
     * This method takes a two-dimensional character array as input and checks if it
     * represents a valid Sudoku board. The method returns true if the board is valid
     * and false otherwise. A board is considered valid if it meets the following
     * criteria:
     * Each row contains the digits 1-9 without repetition.
     * Each column contains the digits 1-9 without repetition.
     * Each of the 9 3x3 sub-boxes contains the digits 1-9 without repetition.
     * <p>
     * Time complexity: O(n^2)
     * Explanation: The method iterates through the input board using two nested
     * loops, which results in a time complexity of O(n^2), where n is the length of
     * one side of the board (9 for a standard Sudoku board). The contains() and add()
     * methods of the HashSet have an average time complexity of O(1), so the overall
     * time complexity of the method is O(n^2).
     * <p>
     * Space complexity: O(n^2)
     * Explanation: The method creates three HashSets to store the unique elements in
     * each row, column, and sub-box of the board. The worst-case space complexity of
     * each HashSet is O(n^2) if all the elements in the board are unique. Additionally,
     * it uses a few string variables that take constant space, so their contribution
     * to the space complexity is negligible compared to the HashSets.
     *
     * @param board a two-dimensional character array representing a Sudoku board
     * @return true if the board is valid, false otherwise
     */
    public boolean isValidSudoku(char[][] board) {
        Set<String> row = new HashSet<>();
        Set<String> column = new HashSet<>();
        Set<String> box = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') continue;
                String rowString = board[i][j] + " row " + i;
                if (row.contains(rowString)) return false;
                row.add(rowString);
                String columnString = board[i][j] + " column " + j;
                if (column.contains(columnString)) return false;
                column.add(columnString);
                String boxString = board[i][j] + " box " + (i / 3) + "," + (j / 3);
                if (box.contains(boxString)) return false;
                box.add(boxString);
            }
        }

        return true;
    }
}
