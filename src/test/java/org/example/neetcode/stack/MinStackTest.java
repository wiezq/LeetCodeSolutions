package org.example.neetcode.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinStackTest {

    MinStack minStack;

    @BeforeEach
    public void setup() {
        minStack = new MinStack();
    }

    @Test
    public void test1() {
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(-3, minStack.getMin()); // return -3
        minStack.pop();
        assertEquals(0, minStack.top());    // return 0
        assertEquals(-2, minStack.getMin()); // return -2
    }
}
