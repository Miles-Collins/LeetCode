class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] numsDoubled = new int[n*2];
        
        for(int i = 0; i < n; i++) {
            numsDoubled[i] = nums[i];
            numsDoubled[i + n] = nums[i];
        }

        return numsDoubled;
    }
}