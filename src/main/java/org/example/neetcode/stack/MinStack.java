package org.example.neetcode.stack;


import java.util.Stack;

/*
    Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

    Implement the MinStack class:

    MinStack() initializes the stack object.
    void push(int val) pushes the element val onto the stack.
    void pop() removes the element on the top of the stack.
    int top() gets the top element of the stack.
    int getMin() retrieves the minimum element in the stack.
    You must implement a solution with O(1) time complexity for each function.

    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    minStack.getMin(); // return -3
    minStack.pop();
    minStack.top();    // return 0
    minStack.getMin(); // return -2
*/
public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> min;


    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();

    }

    public void push(int val) {
        stack.push(val);
        if (min.empty()) {
            min.push(val);
        } else {
            int currentMin = min.peek();
            min.push(Math.min(val, currentMin));
        }
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
