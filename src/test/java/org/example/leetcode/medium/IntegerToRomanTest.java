package org.example.leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerToRomanTest {
    IntegerToRoman integerToRoman;

    @BeforeEach
    public void setup(){
        integerToRoman = new IntegerToRoman();
    }

    @Test
    public void test1(){
        int input = 3;
        String output = integerToRoman.intToRoman(input);
        String expected = "III";
        assertEquals(expected, output);
    }

    @Test
    public void test2(){
        int input = 58;
        String output = integerToRoman.intToRoman(input);
        String expected = "LVIII";
        assertEquals(expected, output);
    }

    @Test
    public void test3(){
        int input = 1994;
        String output = integerToRoman.intToRoman(input);
        String expected = "MCMXCIV";
        assertEquals(expected, output);
    }


}
