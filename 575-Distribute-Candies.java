class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        int length = candyType.length / 2;
        for(int candy : candyType) {
            set.add(candy);
        }
        int candyLength = set.size();
        if(candyLength < length) {
            return candyLength;
        } else {
            return length;
        }
    }
}