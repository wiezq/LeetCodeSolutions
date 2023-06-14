package org.example.neetcode.arraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    /**
     <p>This method takes an array of integers and returns the length of the longest
     consecutive sequence of integers in the array.</p>
     <p>Time complexity: O(n)</p>
     <p>Explanation: The method iterates through the input array once to create a
     HashSet of integers. It then iterates through the input array again to check
     for consecutive sequences. The while loop inside the second loop will execute
     at most n times, as it will only continue as long as there are consecutive
     numbers in the HashSet. The contains() method of the HashSet has an average
     time complexity of O(1), which makes the overall time complexity of the method
     O(n).</p>
     <p>Space complexity: O(n)</p>
     <p>Explanation: The method creates a HashSet with n elements to store the input
     array. Additionally, it uses a few integer variables that take constant space,
     so their contribution to the space complexity is negligible compared to the
     HashSet.</p>
     @param nums the array of integers to find the longest consecutive sequence in
     @return the length of the longest consecutive sequence of integers in the array
     */
    public int longestConsecutive(int[] nums) {
        int answer = 0;
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        for (int num : nums) {
            if (!numSet.contains(num - 1)) {
                int temp_max = 1;
                int temp_value = num;
                while (numSet.contains(temp_value + 1)) {
                    temp_max++;
                    temp_value++;
                }
                if (temp_max > answer) answer = temp_max;

            }
        }
        return answer;
    }
}
