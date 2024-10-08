class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i < flowerbed.length; i++) {
            int flower = flowerbed[i];
            if(flower == 0) {
                boolean isEmptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean isEmptyRight = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if(isEmptyLeft && isEmptyRight) {
                    count++;
                    flowerbed[i] = 1;
                }

                if(count >= n) return true;
            }
        }
        return count >= n;
    }
}