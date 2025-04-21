class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        vector<bool> doesKidHaveMostCandies(candies.size());
        int max = 0;
        for(int candy : candies) {
            max = std::max(max, candy);
        }
        for(int i = 0; i < candies.size(); i++) {
            int candy = candies[i];
            if(candy + extraCandies >= max) {
                doesKidHaveMostCandies[i] = true;
            } else {
                doesKidHaveMostCandies[i] = false;
            }
        }
        return doesKidHaveMostCandies;
    }
};