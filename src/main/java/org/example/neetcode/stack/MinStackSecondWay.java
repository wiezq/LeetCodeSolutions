package org.example.neetcode.stack;

import java.util.Stack;
//This way using node instead of second stack
//of minimum integers spends a little bit more memory (47.2 MB compared to 47 MB referring to leetcode)
public class MinStackSecondWay {

    Stack<Node> stack;

    public MinStackSecondWay(){
        stack = new Stack<>();
    }

    static class Node{
        public int value;
        public int min;

        Node(int value, int min){
            this.value = value;
            this.min = min;
        }
    }

    public void push(int val) {
        if(stack.empty()){
            stack.push(new Node(val, val));
        }
        else {
            Node current = stack.peek();
            if (val < current.min){
                stack.push(new Node(val, val));
            }
            else stack.push(new Node(val, current.min));
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().value;
    }

    public int getMin() {
        return stack.peek().min;
    }
}
