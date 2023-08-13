package org.example.neetcode.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {

    ValidParentheses validParentheses;

    @BeforeEach
    public void setup(){
        validParentheses = new ValidParentheses();
    }

    @Test
    public void test1(){
        String input = "[]";
        boolean result = validParentheses.isValid(input);
        Assertions.assertTrue(result);
    }

    @Test
    public void test2(){
        String input = "[}";
        boolean result = validParentheses.isValid(input);
        Assertions.assertFalse(result);
    }

    @Test
    public void test3(){
        String input = "({})";
        boolean result = validParentheses.isValid(input);
        Assertions.assertTrue(result);
    }

    @Test
    public void test4(){
        String input = "(){}[]";
        boolean result = validParentheses.isValid(input);
        Assertions.assertTrue(result);
    }

    @Test
    public void test5(){
        String input = "(";
        boolean result = validParentheses.isValid(input);
        Assertions.assertFalse(result);
    }

    @Test
    public void test6(){
        String input = "((";
        boolean result = validParentheses.isValid(input);
        Assertions.assertFalse(result);
    }

    @Test
    public void test7(){
        String input = "){";
        boolean result = validParentheses.isValid(input);
        Assertions.assertFalse(result);
    }

    @Test
    public void test8(){
        String input = "([}}])";
        boolean res = validParentheses.isValid(input);
        Assertions.assertFalse(res);
    }
}
