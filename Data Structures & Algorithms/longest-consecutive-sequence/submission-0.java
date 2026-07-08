class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int result = 0;

        for(int num : nums){
            set.add(num);
        }

        for(int num : set){
            if(!set.contains(num - 1)){
                int currNum = num;
                int currStreak = 1;

                while(set.contains(currNum + 1)){
                    currNum += 1;
                    currStreak += 1;
                }

                result = Math.max(result, currStreak);

            }
        }
        return result;

    }
}
