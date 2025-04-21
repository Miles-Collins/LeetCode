class Solution {
public:
    bool canPlaceFlowers(vector<int>& flowerbed, int n) {
        if(n == 0) {
            return true;
        }

        for(int i = 0; i <flowerbed.size(); i++) {
            bool isLeftEmpty = i == 0 || flowerbed[i - 1] == 0;
            bool isRightEmpty = i == flowerbed.size() - 1 || flowerbed[i + 1] == 0;
            if(flowerbed[i] == 0 && isLeftEmpty && isRightEmpty) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }
};