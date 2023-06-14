package org.example.neetcode.arraysAndHashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparingInt;

public class GroupAnagramsTest {

    GroupAnagrams groupAnagrams;

    @BeforeEach
    void setUp() {
        groupAnagrams = new GroupAnagrams();
    }

    @Test
    public void test() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> answer = groupAnagrams.groupAnagrams(input);
        answer.sort(comparingInt(List::size));
        List<List<String>> right_answer = new ArrayList<>(List.of(
                new ArrayList<>(List.of("bat")),
                new ArrayList<>(List.of("tan","nat")),
                new ArrayList<>(List.of("eat","tea", "ate"))
        ));

        right_answer.sort(comparingInt(List::size));
        Assertions.assertEquals(answer, right_answer);

    }

    @Test
    public void test2() {
        String[] input = {""};
        List<List<String>> answer = groupAnagrams.groupAnagrams(input);
        List<List<String>> right_answer = List.of(
                List.of("")

        );
        Assertions.assertEquals(answer, right_answer);

    }

    @Test
    public void test3() {
        String[] input = {"a"};
        List<List<String>> answer = groupAnagrams.groupAnagrams(input);
        List<List<String>> right_answer = List.of(
                List.of("a")

        );
        Assertions.assertEquals(answer, right_answer);
    }

}
