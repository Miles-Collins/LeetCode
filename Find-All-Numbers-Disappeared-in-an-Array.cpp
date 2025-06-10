class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        vector<int> arr(nums.size() +  1, 0);

        for(int num : nums) {
            arr[num]++;
        }

        vector<int> ans;

        for(int i = 1; i < arr.size(); i++) {
            if(arr[i] == 0) {
                ans.push_back(i);
            }
        }

        return ans;
    }
};