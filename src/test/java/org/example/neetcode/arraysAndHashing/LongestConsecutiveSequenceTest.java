package org.example.neetcode.arraysAndHashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LongestConsecutiveSequenceTest {

    LongestConsecutiveSequence longestConsecutiveSequence;


    @BeforeEach
    public void setup() {
        longestConsecutiveSequence = new LongestConsecutiveSequence();
    }


    @Test
    public void test1() {
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        int result = longestConsecutiveSequence.longestConsecutive(nums);
        int expected = 4;
        assertEquals(expected, result);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int result = longestConsecutiveSequence.longestConsecutive(nums);
        int expected = 9;
        assertEquals(expected, result);
    }


    @Test
    public void test3() {
        int[] nums = new int[]{};
        int result = longestConsecutiveSequence.longestConsecutive(nums);
        int expected = 0;
        assertEquals(expected, result);
    }
}
