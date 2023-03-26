package org.example.arraysAndHashing;

import leetcode.arraysAndHashing.LongestConsecutiveSequence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LongestConsecutiveSequenceTest {

    LongestConsecutiveSequence longestConsecutiveSequence;


    @BeforeEach
    public void setup() {
        longestConsecutiveSequence = new LongestConsecutiveSequence();
    }


    @Test
    public void test1() {
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        int answer = longestConsecutiveSequence.longestConsecutive(nums);
        Assertions.assertEquals(4, answer);
    }

    @Test
    public void test2() {
        int[] nums = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int answer = longestConsecutiveSequence.longestConsecutive(nums);
        Assertions.assertEquals(9, answer);
    }


    @Test
    public void test3(){
        int[] nums = new int[]{};
        int answer = longestConsecutiveSequence.longestConsecutive(nums);
        Assertions.assertEquals(0,  answer);
    }
}
