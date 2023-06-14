package org.example.neetcode.arraysAndHashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class EncodeAndDecodeTest {

    EncodeAndDecode encodeAndDecode;

    @BeforeEach
    public void setUp() {
        encodeAndDecode = new EncodeAndDecode();
    }

    @Test
    public void test1() {
        List<String> input = List.of("lint", "code", "love", "you");
        String inputString = encodeAndDecode.encode(input);
        List<String> output = encodeAndDecode.decode(inputString);
        Assertions.assertEquals(input, output);
    }

    @Test
    public void test2() {
        List<String> input = List.of("we", "say", ":", "yes");
        String inputString = encodeAndDecode.encode(input);
        List<String> output = encodeAndDecode.decode(inputString);
        Assertions.assertEquals(input, output);
    }
}
