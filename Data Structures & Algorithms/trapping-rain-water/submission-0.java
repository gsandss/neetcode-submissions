class Solution {
    public int trap(int[] height) {

        // Two Initial Pointers;
        int left = 0;
        int right = height.length - 1;

        // The max of the left and right walls
        int leftMax = 0;
        int rightMax = 0;

        int totalWater = 0;        

        while(left < right){

            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if(leftMax < rightMax){
                totalWater += leftMax - height[left];
                left++;
            }
            else{
                totalWater += rightMax - height[right];
                right--;
            }
        }
        return totalWater;
    }
}
