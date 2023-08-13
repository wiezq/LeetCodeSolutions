package org.example.neetcode.slidingWindow;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;
        int left = 0;
        int right = 1;
        int max = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                max = Math.max(max, prices[right] - prices[left]);
                right++;
            } else {
                left = right;
                right++;
            }
        }
        return max;
    }
}
