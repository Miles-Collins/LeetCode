class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = 0;
        ArrayList<Boolean> isMostCandy = new ArrayList<>(candies.length);

        for(int candy : candies) {
            maxCandy = Math.max(maxCandy, candy);
        }

        for(int candy : candies) {
            if(candy + extraCandies >= maxCandy) {
                isMostCandy.add(true);
            } else {
                isMostCandy.add(false);
            }
        }

        return isMostCandy;
    }
}