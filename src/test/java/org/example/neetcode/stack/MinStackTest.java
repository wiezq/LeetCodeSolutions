package org.example.neetcode.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MinStackTest {

    MinStack minStack;

    @BeforeEach
    public void setup(){
        minStack = new MinStack();
    }

    @Test
    public void test1(){
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        Assertions.assertEquals(-3, minStack.getMin()); // return -3
        minStack.pop();
        Assertions.assertEquals(0, minStack.top());    // return 0
        Assertions.assertEquals(-2, minStack.getMin()); // return -2
    }
}
