package leetcode.arraysAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

    /**
     * <p>Returns the top k frequent elements in an integer array.</p>
     * <p>Time complexity: O(n)</p>
     * <p>Where n is the length of the input array nums. The for loop
     * iterating over the nums array has a time complexity of O(n). The loop over the bucket
     * array has a time complexity of O(n) as well.</p>
     *
     * <p>Space complexity: O(n)</p>
     * <p>Where n is the length of the input array nums. The space
     * required for the hashmap is O(n). The bucket array has a length of n + 1, so it requires
     * O(n) space as well. The answer array requires O(k) space. Overall, the space
     * complexity is O(n).</p>
     *
     * @param nums the input integer array
     * @param k    the number of top frequent elements to return
     * @return an integer array containing the top k frequent elements
     */
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Creating hash map of number frequency
        // for example [1,1,1,2,2,3]
        // {
        //      1 : 3,
        //      2 : 2,
        //      3 : 1
        // }
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }


        // Creating an array of lists to group numbers to their frequency
        // Bucket length will be inputArray.length + 1;
        // [0, 1,  2,  3, 4, 5, 6] - indexes for bucket
        // [-,[3],[2],[1],-, -, -] - and values
        List<Integer>[] bucket = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (bucket[value] == null) {
                bucket[value] = new ArrayList<>();
            }
            bucket[value].add(entry.getKey());
        }

        // Then we are creating answer array with k length and index
        int[] answer = new int[k];
        int index = 0;
        // Then we iterate reversely through bucket array and find top k frequent elements
        for (int i = bucket.length - 1; i > 0 && index < k; i--) {
            if (bucket[i] != null) {
                for (int j = 0; j < bucket[i].size() && index < k; j++) {
                    answer[index++] = bucket[i].get(j);
                }
            }
        }

        return answer;
    }
}
