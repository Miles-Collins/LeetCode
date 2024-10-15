class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i < flowerbed.length; i++) {
            int currentFlower = flowerbed[i];
            if(currentFlower == 0) {
                if(i == 0 || flowerbed[i - 1] == 0) {
                    boolean isLeftEmpty = true;
                }
                if(i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                    boolean isRightEmpty = true;
                }
                if(isLeftEmpty && isRightEmpty) {
                    count++;
                    flowerbed[i] = 1;
                }
            }
            if(count >= n) return true;
        }
        return count >= n;
    }
}