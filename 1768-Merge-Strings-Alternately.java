class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int m = word1.length(), n = word2.length();

        int i = 0, j = 0;
        while(i < m || j < n) {
            if(i < m) sb.append(word1.charAt(i));
            if(j < n) sb.append(word2.charAt(j));
            i++;
            j++;
        }

        return sb.toString();
    }
}