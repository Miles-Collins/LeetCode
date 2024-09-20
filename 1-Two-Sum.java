class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        int j = 1;
        while(j < nums.length) {
            for(int i = 0; i + j < nums.length; i++) {
                if(nums[i] + nums[j + i] == target) {
                    sum[0] = i;
                    sum[1] = i + j;
                    return sum;
                }
            }
            j++;
        }
        return sum;
    }
}