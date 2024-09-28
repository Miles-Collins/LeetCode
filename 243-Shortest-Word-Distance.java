class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int minDistance = Integer.MAX_VALUE;
        int index1 = -1, index2 = -1;
        for (int i = 0; i < wordsDict.length; i++) {
            String word = wordsDict[i];
            if (word.equals(word1)) index1 = i;
            if (word.equals(word2)) index2 = i;
            if (index1 != -1 && index2 != -1) minDistance = Math.min(minDistance, Math.abs(index1 - index2));
        }
        return minDistance;
    }
}