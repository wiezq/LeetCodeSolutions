package org.example.neetcode.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenerateParenthesesTest {
    GenerateParentheses gp;

    @BeforeEach
    public void setup() {
        gp = new GenerateParentheses();
    }

    @Test
    public void test1() {
        int input = 3;
        List<String> expected = List.of("((()))", "(()())", "(())()", "()(())", "()()()");
        List<String> result = gp.generateParenthesis(input);
        Set<String> expectedSet = new HashSet<>(expected);
        Set<String> resultSet = new HashSet<>(result);
        assertEquals(expectedSet, resultSet);
    }

    @Test
    public void test2() {
        int input = 1;
        List<String> expected = List.of("()");
        List<String> result = gp.generateParenthesis(input);
        Set<String> expectedSet = new HashSet<>(expected);
        Set<String> resultSet = new HashSet<>(result);
        assertEquals(expectedSet, resultSet);
    }
}
