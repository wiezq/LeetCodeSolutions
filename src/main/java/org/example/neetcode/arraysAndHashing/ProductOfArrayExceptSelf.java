package org.example.neetcode.arraysAndHashing;

public class ProductOfArrayExceptSelf {

    /**
     * <p>Returns an array of the same length as input array where each element is
     * the product of all elements except itself.</p>
     *
     * <p>This method uses prefix and postfix products to calculate the final answer.
     * First, it creates a new array answer of the same length as the input nums.
     * Then, it loops over the input array nums twice to calculate the prefix and postfix products and stores
     * them in answer by multiplying the prefix and postfix products.
     * Finally, it returns answer.</p>
     *
     * <p>Time complexity: O(n)</p>
     *
     * <p>Where n is the length of the input array nums, because it loops over nums twice,
     * once in the forward direction and once in the backward direction, each taking O(n) time.</p>
     *
     * <p>Space complexity: O(1)</p>
     *
     * <p>Because it uses only a constant amount of extra space
     * for storing the prefix and postfix products and the answer array.</p>
     *
     * @param nums the input array of integers
     * @return an array of the same length as input array where each element is the product of all elements except itself
     */
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            answer[i] = prefix;
            prefix *= nums[i];
        }

        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= postfix;
            postfix *= nums[i];
        }

        return answer;
    }

    /**
     * <p>Calculates the product of all elements in the input array except the current
     * element using a pre-postfix solution.</p>
     * <p>Time Complexity: O(n)</p>
     * <p>Where n is the length of the input array.
     * We use three loops to calculate prefix and postfix arrays and one loop to fill the answer array.</p>
     * <p>Space Complexity: O(n)</p>
     * <p>Where n is the length of the input array.
     * We use prefix, postfix, and answer arrays of size n to store intermediate results.</p>
     *
     * @param nums an array of integers
     * @return an array of integers where each element at index i is the product of all elements in the input array except nums[i]
     */
    public int[] productExceptSelfPrePostFixSolution(int[] nums) {
        int[] answer = new int[nums.length];
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        int[] postfix = new int[nums.length];
        postfix[nums.length - 1] = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i] * prefix[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            postfix[i] = nums[i] * postfix[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            int pref = i == 0 ? 1 : prefix[i - 1];
            int post = i == nums.length - 1 ? 1 : postfix[i + 1];
            answer[i] = pref * post;
        }

        return answer;
    }


}
