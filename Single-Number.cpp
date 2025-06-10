class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int XOR1 = 0;
        for(int num : nums) {
            XOR1 ^= num;
        }
        return XOR1;
    }
};