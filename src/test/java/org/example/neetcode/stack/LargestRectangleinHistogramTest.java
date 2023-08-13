package org.example.neetcode.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LargestRectangleinHistogramTest {

    LargestRectangleinHistogram lr;

    @BeforeEach
    public void setup(){
        lr = new LargestRectangleinHistogram();
    }

    @Test
    public void test1(){
        int[] input = new int[]{2,1,5,6,2,3};
        int result = lr.largestRectangleArea(input);
        int expected = 10;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test2(){
        int[] input = new int[]{2,4};
        int result = lr.largestRectangleArea(input);
        int expected = 4;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test3(){
        int[] input = new int[]{2,1,2};
        int result = lr.largestRectangleArea(input);
        int expected = 3;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void test4(){
        int[] input = new int[]{0, 9};
        int result = lr.largestRectangleArea(input);
        int expected = 9;
        Assertions.assertEquals(expected, result);
    }


}
