package org.example.neetcode.slidingWindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PermutationInStringTest {

    PermutationInString ps;

    @BeforeEach
    public void setup() {
        ps = new PermutationInString();
    }

    @Test
    public void test1() {
        String inputS1 = "ab";
        String inputS2 = "eidbaooo";
        boolean result = ps.checkInclusion(inputS1, inputS2);
        assertTrue(result);
    }

    @Test
    public void test2() {
        String inputS1 = "ab";
        String inputS2 = "eidboaoo";
        boolean result = ps.checkInclusion(inputS1, inputS2);
        assertFalse(result);
    }

    @Test
    public void test3() {
        String inputS1 = "adc";
        String inputS2 = "dcda";
        boolean result = ps.checkInclusion(inputS1, inputS2);
        assertTrue(result);
    }
}
