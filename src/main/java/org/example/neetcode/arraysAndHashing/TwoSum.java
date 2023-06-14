package org.example.neetcode.arraysAndHashing;

import java.util.HashMap;

public class TwoSum {

    /**
     <p>This method takes an array of integers and a target integer as input and returns the indices of the two
     numbers in the array that add up to the target. The method uses a HashMap to keep track of the numbers
     it has encountered so far, with the numbers being the keys and their indices in the array being the values.
     For each number in the array, the method calculates the difference between the target and the number, and
     checks if this difference exists in the HashMap. If it does, the method returns the indices of the current
     number and the difference, since they add up to the target. If the difference does not exist in the HashMap,
     the current number and its index are added to the HashMap for future reference.</p>
     <p>Time complexity: O(n)</p>
     <p>Explanation: The method iterates through the input array once using a loop, which results in a time
     complexity of O(n), where n is the length of the array. The HashMap's put() and get() methods have an
     average time complexity of O(1), so the overall time complexity of the method is O(n).</p>
     <p>Space complexity: O(n)</p>
     <p>Explanation: The method creates a HashMap to store the numbers it has encountered so far, with each key-value
     pair taking up constant space. In the worst-case scenario, all numbers in the array are unique, resulting in
     a space complexity of O(n) for the HashMap. Additionally, it creates a constant-sized array to store the answer,
     so its contribution to the space complexity is negligible compared to the HashMap.</p>
     @param nums the array of integers to search for pairs that add up to the target
     @param target the target integer that the pairs should add up to
     @return an array of two integers containing the indices of the two numbers that add up to the target
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[]{0, 1};
        if (nums.length == 2) return answer;
        for (int i = 0; i < nums.length; i++) {
            int otherNumber = target - nums[i];
            if (map.containsKey(otherNumber)) {
                answer = new int[]{i, map.get(otherNumber)};
                return answer;
            } else {
                map.put(nums[i], i);
            }
        }
        return answer;
    }
}