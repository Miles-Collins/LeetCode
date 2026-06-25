class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] counter = new int[nums.length];
        List<Integer> ans = new ArrayList<>();
        for(int num:nums) {
            counter[num - 1]++;
        }
        for(int i = 0; i < nums.length; i++) {
            if(counter[i] == 0) {
                ans.add(i + 1);
            }
        }
        return ans;
    }
}