package org.example.neetcode.slidingWindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockTest {
    BestTimeToBuyAndSellStock a;

    @BeforeEach
    public void setup() {
        a = new BestTimeToBuyAndSellStock();
    }

    @Test
    public void test1() {
        int[] prices_input = new int[]{7, 1, 5, 3, 6, 4};
        int result = a.maxProfit(prices_input);
        int expected = 5;
        assertEquals(expected, result);

    }

    @Test
    public void test2() {
        int[] prices_input = new int[]{7, 6, 5, 4, 3, 2, 1};
        int result = a.maxProfit(prices_input);
        int expected = 0;
        assertEquals(expected, result);

    }

    @Test
    public void test3() {
        int[] prices_input = new int[]{1};
        int result = a.maxProfit(prices_input);
        int expected = 0;
        assertEquals(expected, result);
    }
}
