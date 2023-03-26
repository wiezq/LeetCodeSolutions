package org.example.arraysAndHashing;

import leetcode.arraysAndHashing.ValidSudoku;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidSudokuTest {
    @Test
    public void testValidSudoku() {
        ValidSudoku solution = new ValidSudoku();
        char[][] board1 = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        assertTrue(solution.isValidSudoku(board1));
    }

    @Test
    public void testInValidSudoku(){
        ValidSudoku solution = new ValidSudoku();
        char[][] board2 = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        assertFalse(solution.isValidSudoku(board2));
    }
}
