package org.example.arraysAndHashing;

import leetcode.arraysAndHashing.ContainsDuplicate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContainsDuplicateTest {

    ContainsDuplicate containsDuplicate;


    @BeforeEach
    public void setup() {
        containsDuplicate = new ContainsDuplicate();
    }


    @Test
    public void test() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        Assertions.assertFalse(containsDuplicate.containsDuplicate(nums));
    }


    @Test
    public void test2() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 5};
        Assertions.assertTrue(containsDuplicate.containsDuplicate(nums));
    }
}
