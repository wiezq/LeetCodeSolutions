package org.example.neetcode.stack;

import java.util.Stack;

public class ValidParentheses {

    //Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    //
    //An input string is valid if:
    //
    //Open brackets must be closed by the same type of brackets.
    //Open brackets must be closed in the correct order.
    //Every close bracket has a corresponding open bracket of the same type.
    public boolean isValid(String str) {
        if (str.length() % 2 != 0) return false;
        Stack<Character> a = new Stack<>();
        for (Character c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                a.push(c);
            } else if (!a.empty()){
                if (a.peek() == '(' && c == ')') {
                    a.pop();
                } else if (a.peek() == '[' && c == ']') {
                    a.pop();
                } else if (a.peek() == '{' && c == '}') {
                    a.pop();
                }
                else return false;
            } else return false;
        }
        return a.empty();
    }
}
