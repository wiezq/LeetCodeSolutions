package org.example.neetcode.stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    List<String> res = new ArrayList<>();

    int max;

    public List<String> generateParenthesis(int n) {
        max = n;
        backtrack(0, 0, "");
        return res;
    }

    public void backtrack(int left, int right, String s){
        if (left == right && right == max){
            res.add(s);
            return;
        }
        if(left < max) backtrack(left + 1, right, s + "(");
        if (right < left) backtrack(left, right + 1, s + ")");
    }
}
