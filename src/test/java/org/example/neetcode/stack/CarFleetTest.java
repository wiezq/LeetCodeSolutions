package org.example.neetcode.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarFleetTest {

    CarFleet cf;

    @BeforeEach
    public void setup() {
        cf = new CarFleet();
    }

    @Test
    public void test1() {
        int target = 12;
        int[] positions = new int[]{10, 8, 0, 5, 3};
        int[] speed = new int[]{2, 4, 1, 1, 3};
        int result = cf.carFleet(target, positions, speed);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void test2() {
        int target = 10;
        int[] positions = new int[]{3};
        int[] speed = new int[]{3};
        int result = cf.carFleet(target, positions, speed);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void test3() {
        int target = 100;
        int[] positions = new int[]{0, 2, 4};
        int[] speed = new int[]{4, 2, 1};
        int result = cf.carFleet(target, positions, speed);
        int expected = 1;
        assertEquals(expected, result);
    }
}
