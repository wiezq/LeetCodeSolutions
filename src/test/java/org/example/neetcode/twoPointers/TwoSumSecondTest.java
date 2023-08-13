package org.example.neetcode.twoPointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumSecondTest {
    TwoSumSecond twoSumSecond;


    @BeforeEach
    public void setup() {
        twoSumSecond = new TwoSumSecond();
    }

    @Test
    public void test1() {
        int[] inputArray = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[]{1, 2};
        int[] result = twoSumSecond.twoSum(inputArray, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test2() {
        int[] inputArray = new int[]{2, 3, 4};
        int target = 6;
        int[] expected = new int[]{1, 3};
        int[] result = twoSumSecond.twoSum(inputArray, target);
        assertArrayEquals(expected, result);
    }
}
