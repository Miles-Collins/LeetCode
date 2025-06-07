class Solution {
public:
    int singleNumber(vector<int>& nums) {
        if(nums.size() == 1) return nums[0];

        unordered_set<int> seen;

        for(int num : nums) {
            if(seen.count(num)) {
                seen.erase(num);
            } else {
                seen.insert(num);
            }
        }

        return *seen.begin();
    }
};