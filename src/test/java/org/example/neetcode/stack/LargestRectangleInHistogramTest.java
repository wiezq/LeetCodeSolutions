package org.example.neetcode.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestRectangleInHistogramTest {

    LargestRectangleInHistogram lr;

    @BeforeEach
    public void setup() {
        lr = new LargestRectangleInHistogram();
    }

    @Test
    public void test1() {
        int[] input = new int[]{2, 1, 5, 6, 2, 3};
        int expected = 10;
        int result = lr.largestRectangleArea(input);
        assertEquals(expected, result);
    }

    @Test
    public void test2() {
        int[] input = new int[]{2, 4};
        int expected = 4;
        int result = lr.largestRectangleArea(input);
        assertEquals(expected, result);
    }

    @Test
    public void test3() {
        int[] input = new int[]{2, 1, 2};
        int expected = 3;
        int result = lr.largestRectangleArea(input);
        assertEquals(expected, result);
    }

    @Test
    public void test4() {
        int[] input = new int[]{0, 9};
        int expected = 9;
        int result = lr.largestRectangleArea(input);
        assertEquals(expected, result);
    }


}
