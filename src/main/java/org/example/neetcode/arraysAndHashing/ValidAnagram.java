package org.example.neetcode.arraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    /**
     * <p>This method takes two strings as input and checks if they are anagrams of each other.
     * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
     * typically using all the original letters exactly once. The method returns true if the two strings
     * are anagrams and false otherwise. To check if two strings are anagrams, the method creates two
     * HashMaps that store the frequency of each character in each string. If the HashMaps are equal,
     * the two strings are anagrams.</p>
     * <p>Explanation: The method iterates through the two input strings using two separate loops, which results
     * in a time complexity of O(n), where n is the length of the strings. The putIfAbsent() and computeIfPresent()
     * methods of the HashMap have an average time complexity of O(1), so the overall time complexity of the method
     * is O(n).</p>
     * <p>Explanation: The method creates two HashMaps to store the frequency of each character in each string. In the
     * worst-case scenario, all characters in both strings are unique, resulting in a space complexity of O(n) for
     * each HashMap. Additionally, it uses a few string variables that take constant space, so their contribution
     * to the space complexity is negligible compared to the HashMaps.</p>
     *
     * <p>Space complexity: O(n)</p>
     * <p>Time complexity: O(n)</p>
     *
     * @param s the first string to check for anagrams
     * @param t the second string to check for anagrams
     * @return true if the two strings are anagrams, false otherwise
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> charMap1 = new HashMap<>();
        Map<Character, Integer> charMap2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charMap1.putIfAbsent(s.charAt(i), 1);
            charMap1.computeIfPresent(s.charAt(i), (character, integer) -> integer + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            charMap2.putIfAbsent(t.charAt(i), 1);
            charMap2.computeIfPresent(t.charAt(i), (character, integer) -> integer + 1);
        }
        return charMap1.equals(charMap2);
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 97]++;
            a[t.charAt(i) - 97]--;
        }

        for (int i = 0; i < 26; i++) {
            if (a[i] != 0) return false;
        }
        return true;
    }
}