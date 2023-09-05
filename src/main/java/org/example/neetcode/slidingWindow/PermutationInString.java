package org.example.neetcode.slidingWindow;

import java.util.Arrays;

public class PermutationInString {


    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int[] freq = new int[26];
        int m = s2.length();
        for (int i = 0; i < n; i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        int[] freq2 = new int[26];
        for (int i = 0; i < m; i++) {
            freq2[s2.charAt(i) - 'a']++;
            if (i >= n) {
                freq2[s2.charAt(i - n) - 'a']--;
            }
            if (Arrays.equals(freq, freq2))
                return true;
        }
        return false;
    }

    public boolean checkInclusionMine(String s1, String s2){
        int left = 0;
        int right = 0;

        int[] s1Freq = new int[26];
        for(int i = 0; i < s1.length(); i++){
            s1Freq[s1.charAt(i) - 'a']++;
        }

        int[] s2Freq = new int[26];
        while(right < s2.length()){
            s2Freq[s2.charAt(right) - 'a']++;

            if((right - left) + 1 > s1.length()){
                s2Freq[s2.charAt(left) - 'a']--;
                left++;
            }

            if(Arrays.equals(s1Freq, s2Freq)) return true;

            right++;





//            String temp = s2.substring(left, right);
//            HashMap<Character, Integer> b = new HashMap<>();
//            for(int i = 0; i < temp.length(); i++){
//                char tempChar = temp.charAt(i);
//                if(a.containsKey(tempChar)) {
//                    b.put(tempChar, b.getOrDefault(tempChar, 0) + 1);
//                }
//                else {
//                    break;
//                }
//
//            }
//            if(a.equals(b)) return true;
//            left++;
//            right++;
        }
        return false;
    }
}
