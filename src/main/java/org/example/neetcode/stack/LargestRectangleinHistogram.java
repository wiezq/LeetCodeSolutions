package org.example.neetcode.stack;

public class LargestRectangleinHistogram {
    public int largestRectangleArea(int[] heights) {
        if(heights.length == 1) return heights[0];
        int max = 0;
        for(int i = 0; i < heights.length; i++){
            int currH = heights[i];
            int area = currH;
            int l = i-1;
            int r = i+1;
            while(l >= 0){
                if(heights[l] >= currH){
                    area += currH;
                    l--;
                }else {
                    break;
                }
            }
            while (r <= heights.length - 1){
                if(heights[r] >= currH){
                    area += currH;
                    r++;
                }else {
                    break;
                }
            }
            max = Math.max(max, Math.max(currH, area));
        }
        return max;
    }
}
