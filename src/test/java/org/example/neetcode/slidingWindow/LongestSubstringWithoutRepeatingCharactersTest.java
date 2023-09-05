package org.example.neetcode.slidingWindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {

    LongestSubstringWithoutRepeatingCharacters ls;

    @BeforeEach
    public void setup(){
        ls = new LongestSubstringWithoutRepeatingCharacters();
    }


    @Test
    public void test1(){
        String input = "abcabcbb";
        int expected = 3;
        int result = ls.lengthOfLongestSubstring(input);
        assertEquals(expected, result);
    }

    @Test
    public void test2(){
        String input = "bbbbb";
        int expected = 1;
        int result = ls.lengthOfLongestSubstring(input);
        assertEquals(expected, result);
    }
    @Test
    public void test3(){
        String input = "pwwkew";
        int expected = 3;
        int result = ls.lengthOfLongestSubstring(input);
        assertEquals(expected, result);
    }

    @Test
    public void test4(){
        String input = "au";
        int expected = 2;
        int result = ls.lengthOfLongestSubstring(input);
        assertEquals(expected, result);
    }

}
