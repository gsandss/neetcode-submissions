class Solution {
    public int maxArea(int[] heights) {

        int maxWater = 0;
        int i = 0;
        int j = heights.length - 1;

        while(i < j){
            int distance = j - i;
            int minHeight = Math.min(heights[i], heights[j]);
            int currWater = minHeight * distance;

            maxWater = Math.max(maxWater, currWater);
            
            if(heights[i] < heights[j]){
                i++;
            }
            else{
                j--;
            }

        }
        return maxWater;
    }
}
