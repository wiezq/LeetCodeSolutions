package org.example.neetcode.twoPointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Sum3Test {
    Sum3 s;


    @BeforeEach
    public void setup(){
        s = new Sum3();
    }


    @Test
    public void test1(){
        int[] input = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> expected = List.of(
                List.of(-1,0,1),
                List.of(-1,-1, 1)
        );
    }



}
