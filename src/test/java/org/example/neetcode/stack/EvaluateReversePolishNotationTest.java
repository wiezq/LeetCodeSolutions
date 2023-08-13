package org.example.neetcode.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvaluateReversePolishNotationTest {
    EvaluateReversePolishNotaion p;

    @BeforeEach
    public void setup() {
        p = new EvaluateReversePolishNotaion();
    }

    @Test
    public void test() {
        String[] input = new String[]{"2", "1", "+", "3", "*"};
        int result = p.evalRPN(input);
        assertEquals(9, result);
    }

    @Test
    public void test2() {
        String[] input = new String[]{"4", "13", "5", "/", "+"};
        int result = p.evalRPN(input);
        assertEquals(6, result);
    }

    @Test
    public void test3() {
        String[] input = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int result = p.evalRPN(input);
        assertEquals(22, result);
    }


}
