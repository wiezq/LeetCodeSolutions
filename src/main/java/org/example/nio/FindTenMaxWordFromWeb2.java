package org.example.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindTenMaxWordFromWeb2 {
    public static void main(String[] args) {
        countWordFromDict();
    }


    public static void printWords() {
        try (Stream<String> lines = Files.lines(Paths.get("/usr/share/dict/web2"))) {
            lines
                    .filter(s -> s.length() > 20)
                    .sorted(Comparator.comparingInt(String::length).reversed())
                    .limit(10)
                    .forEach(s -> System.out.printf("%s (%d)%n", s, s.length()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void countWordFromDict() {
        try (Stream<String> lines = Files.lines(Paths.get("/usr/share/dict/web2"))) {
            lines
                    .collect(Collectors.groupingBy(String::length, Collectors.counting()))
                    .forEach((integer, aLong) -> System.out.printf("Length: %d Words: %d%n", integer, aLong));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
