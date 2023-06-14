package org.example.neetcode.arraysAndHashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        GroupAnagrams ag = new GroupAnagrams();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> output = ag.groupAnagrams(input);
        System.out.println(output);
    }


    //Time: O(n * m) where N is the length of the input string array, and M is the maximum length of a string in the array.
    //Space: O(N*M), where N is the length of the input string array and M is the maximum length of a string in the array.
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> map = new HashMap<>();
        for(String str: strs){
            List<Integer> chars = new ArrayList<>(Collections.nCopies(26, 0));
            for(int i = 0; i < str.length(); i++){
                int index = str.charAt(i);
                chars.set(index-97, chars.get(index-97) + 1);
            }
            List<String> list = map.getOrDefault(chars, new ArrayList<>());
            list.add(str);
            map.put(chars, list);
        }
        return new ArrayList<>(map.values());
    }



}
