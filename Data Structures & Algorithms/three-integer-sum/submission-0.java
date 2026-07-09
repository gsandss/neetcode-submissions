class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int k = i + 1;      
            int j = nums.length - 1; 

            while (k < j) {
                int sum = nums[i] + nums[k] + nums[j];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[k], nums[j]));

                    while (k < j && nums[k] == nums[k + 1]) k++;
                    while (k < j && nums[j] == nums[j - 1]) j--;

                    k++;
                    j--;
                } else if (sum < 0) {
                    k++; 
                } else {
                    j--; 
                }
            }
        }

        return result;
    }
}