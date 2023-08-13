package org.example.neetcode.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class GenerateParenthesesTest {
    GenerateParentheses gp;

    @BeforeEach
    public void setup(){
        gp = new GenerateParentheses();
    }

    @Test
    public void test1(){
        int input = 3;
        List<String> expected = List.of("((()))","(()())","(())()","()(())","()()()");
        List<String> result = gp.generateParenthesis(input);
        System.out.println("Expected " + expected);
        System.out.println("Result " + result);

    }

    @Test
    public void test2(){
        int input = 1;
        List<String> expected = List.of("()");
        List<String> result = gp.generateParenthesis(input);
        System.out.println("Expected " + expected);
        System.out.println("Result " + result);
    }
}
