package org.example.neetcode.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {

    ValidParentheses validParentheses;

    @BeforeEach
    public void setup() {
        validParentheses = new ValidParentheses();
    }

    @Test
    public void test1() {
        String input = "[]";
        boolean result = validParentheses.isValid(input);
        assertTrue(result);
    }

    @Test
    public void test2() {
        String input = "[}";
        boolean result = validParentheses.isValid(input);
        assertFalse(result);
    }

    @Test
    public void test3() {
        String input = "({})";
        boolean result = validParentheses.isValid(input);
        assertTrue(result);
    }

    @Test
    public void test4() {
        String input = "(){}[]";
        boolean result = validParentheses.isValid(input);
        assertTrue(result);
    }

    @Test
    public void test5() {
        String input = "(";
        boolean result = validParentheses.isValid(input);
        assertFalse(result);
    }

    @Test
    public void test6() {
        String input = "((";
        boolean result = validParentheses.isValid(input);
        assertFalse(result);
    }

    @Test
    public void test7() {
        String input = "){";
        boolean result = validParentheses.isValid(input);
        assertFalse(result);
    }

    @Test
    public void test8() {
        String input = "([}}])";
        boolean res = validParentheses.isValid(input);
        assertFalse(res);
    }
}
