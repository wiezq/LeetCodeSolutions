package org.example.neetcode.slidingWindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        int right = 0;

        HashSet<Character> tempHashSet = new HashSet<>();

        while (right < s.length()) {
            if (!tempHashSet.contains(s.charAt(right))) {
                tempHashSet.add(s.charAt(right));
                right++;
                max = Math.max(tempHashSet.size(), max);
            } else {
                tempHashSet.remove(s.charAt(left));
                left++;
            }
        }

        return max;
    }
}
