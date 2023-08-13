package org.example.neetcode.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DailyTemperaturesTest {
    DailyTemperatures dt;

    @BeforeEach
    public void setup(){
        dt = new DailyTemperatures();
    }

    @Test
    public void test1(){
        int[] input = new int[]{73,74,75,71,69,72,76,73};
        int[] result = dt.dailyTemperatures(input);
        int[] expected = new int[]{1,1,4,2,1,1,0,0};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void test2(){
        int[] input = new int[]{30,40,50,60};
        int[] result = dt.dailyTemperatures(input);
        int[] expected = new int[]{1,1,1,0};
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void test3(){
        int[] input = new int[]{30,60,90};
        int[] result = dt.dailyTemperatures(input);
        int[] expected = new int[]{1,1,0};
        Assertions.assertArrayEquals(expected, result);
    }
}
