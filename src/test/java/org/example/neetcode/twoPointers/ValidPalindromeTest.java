package org.example.neetcode.twoPointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {
    ValidPalindrome validPalindrome;


    @BeforeEach
    public void setup(){
        validPalindrome = new ValidPalindrome();
    }

    @Test
    public void test1(){
        String input = "A man, a plan, a canal: Panama";
        boolean result = validPalindrome.isPalindrome(input);
        Assertions.assertTrue(result);
    }
    @Test
    public void test2(){
        String input = "race a car";
        boolean result = validPalindrome.isPalindrome(input);
        Assertions.assertFalse(result);
    }
    @Test
    public void test3(){
        String input = " ";
        boolean result = validPalindrome.isPalindrome(input);
        Assertions.assertTrue(result);
    }

    @Test
    public void test4(){
        String input = "0P";
        boolean result = validPalindrome.isPalindrome(input);
        Assertions.assertFalse(result);
    }
    @Test
    public void test5(){
        String input = "a.";
        boolean result = validPalindrome.isPalindrome(input);
        Assertions.assertTrue(result);
    }
}
