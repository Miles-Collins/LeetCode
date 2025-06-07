class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int num1 = 0, num2 = 0;
        for(int i = 0; i < nums.size(); i++) {
            num1 = num1 ^ nums[i];
            num2 = num2 ^ (i + 1);
        }
        return num1 ^ num2;
    }
};