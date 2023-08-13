package org.example.neetcode.twoPointers;

public class TwoSumSecond {

    /**
     * The algorithm uses a two-pointer approach to traverse the array. The pointers start
     * at the beginning and end of the array and move towards each other until they find a
     * pair of elements that add up to the target.<br>
     * <p>
     * The time complexity of this algorithm is O(N), Where N is the length of the input array.<br>
     * The space complexity is O(1), because the amount of memory used by the algorithm does not
     * depend on the input size.
     *
     * @param numbers an array of integers to search for a pair of elements that add up to the target
     * @param target  the target sum to find
     * @return an array of two integers which represent the indices of two elements
     * in the input array that add up to the target
     */
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (numbers[left] + numbers[right] != target) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            }
            if (numbers[left] + numbers[right] < target) {
                left++;
            }
        }

        return new int[]{left + 1, right + 1};
    }
}
