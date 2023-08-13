package org.example.neetcode.stack;

import java.util.Stack;

public class EvaluateReversePolishNotaion {


    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){
            int operand1;
            int operand2;
            switch (token){
                    case("*"):
                        operand2 = stack.pop();
                        operand1 = stack.pop();
                        stack.push(operand1 * operand2);
                        break;
                    case("-"):
                        operand2 = stack.pop();
                        operand1 = stack.pop();
                        stack.push(operand1 - operand2);
                        break;
                    case("/"):
                        operand2 = stack.pop();
                        operand1 = stack.pop();
                        stack.push(operand1 / operand2);
                        break;
                    case("+"):
                        operand2 = stack.pop();
                        operand1 = stack.pop();
                        stack.push(operand1 + operand2);
                        break;
                    default:
                        stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }
}
