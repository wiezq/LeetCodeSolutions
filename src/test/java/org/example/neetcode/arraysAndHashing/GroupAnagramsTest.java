package org.example.neetcode.arraysAndHashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparingInt;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupAnagramsTest {

    GroupAnagrams groupAnagrams;

    @BeforeEach
    void setUp() {
        groupAnagrams = new GroupAnagrams();
    }

    @Test
    public void test() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams.groupAnagrams(input);
        result.sort(comparingInt(List::size));
        List<List<String>> expected = new ArrayList<>(List.of(
                new ArrayList<>(List.of("bat")),
                new ArrayList<>(List.of("tan", "nat")),
                new ArrayList<>(List.of("eat", "tea", "ate"))
        ));
        expected.sort(comparingInt(List::size));
        assertEquals(result, expected);

    }

    @Test
    public void test2() {
        String[] input = {""};
        List<List<String>> result = groupAnagrams.groupAnagrams(input);
        List<List<String>> expected = List.of(List.of(""));
        assertEquals(result, expected);

    }

    @Test
    public void test3() {
        String[] input = {"a"};
        List<List<String>> result = groupAnagrams.groupAnagrams(input);
        List<List<String>> expected = List.of(
                List.of("a")
        );
        assertEquals(result, expected);
    }

}
