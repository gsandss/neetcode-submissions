class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        
        int result = right;
        
        while (left <= right) {
            int k = left + (right - left) / 2;
            
            int hoursSpent = 0;
            for (int pile : piles) {
                hoursSpent += Math.ceil((double) pile / k);
            }
            
            if (hoursSpent <= h) {
                result = k;
                right = k - 1;
            } else {
                left = k + 1;  
            }
        }
        
        return result;
    }
}
