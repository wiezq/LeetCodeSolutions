package leetcode.arraysAndHashing;


import java.util.HashSet;
import java.util.Set;


public class ContainsDuplicate {
    /**
     * <p>This method takes an array of integers as input and returns true if the array
     *    contains any duplicate elements, false otherwise.</p>
     * <p>Time complexity: O(n)</p>
     * <p>Explanation: The method iterates through the input array once, performing a
     *    constant-time lookup in the HashSet for each element. The contains() and add()
     *    methods of the HashSet have an average time complexity of O(1),
     *    so the overall time complexity of the method is O(n).</p>
     * <p>Space complexity: O(n)</p>
     * <p>Explanation: The method creates a HashSet to store the unique elements of the
     *    input array. The worst-case space complexity of the HashSet is O(n) if all the
     *    elements in the input array are unique. Additionally, it uses a few integer
     *    variables that take constant space, so their contribution to the space
     *    complexity is negligible compared to the HashSet.</p>
     * @param nums the array of integers to check for duplicates
     * @return true if the array contains any duplicate elements, false otherwise
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for (int num : nums) {
            if (unique.contains(num)) return true;
            unique.add(num);
        }
        return false;
    }

}
