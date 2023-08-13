package org.example.neetcode.arraysAndHashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateTest {

    ContainsDuplicate containsDuplicate;

    @BeforeEach
    public void setup() {
        containsDuplicate = new ContainsDuplicate();
    }


    @Test
    public void test() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        boolean result = containsDuplicate.containsDuplicate(nums);
        assertFalse(result);
    }


    @Test
    public void test2() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 5};
        boolean result = containsDuplicate.containsDuplicate(nums);
        assertTrue(result);
    }
}
