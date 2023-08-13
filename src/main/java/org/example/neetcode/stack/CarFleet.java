package org.example.neetcode.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;

public class CarFleet {

    public int carFleet(int target, int[] position, int[] speed) {

        if (position.length == 1) return 1;

        Deque<Double> time = new ArrayDeque<>();
        int[][] combine = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            combine[i][0] = position[i];
            combine[i][1] = speed[i];
        }
        Arrays.sort(combine, Comparator.comparingInt(com -> com[0]));

        for (int i = position.length - 1; i >= 0; i--) {
            double currentTime = (target - combine[i][0]) / (combine[i][1] * 1.0);
            if (time.isEmpty() || !(currentTime <= time.peek())) {
                time.push(currentTime);
            }
        }
        return time.size();
    }
}
