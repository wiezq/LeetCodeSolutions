
package org.example.neetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperatures {

    //Note Deque implemented as Stuck faster 3x times
    public int[] dailyTemperatures(int[] temperatures) {
        if (temperatures.length == 1) return new int[]{0};
        int[] answer = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < temperatures.length; i++) {
            if (stack.isEmpty() || temperatures[i] < temperatures[stack.peek()]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                    int temp = stack.pop();
                    answer[temp] = i - temp;
                }
                stack.push(i);
            }
        }
        return answer;
    }
}
