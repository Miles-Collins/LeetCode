class Solution {
      boolean isVowel(char c) {
        return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u'
                || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U';
    }

    void swap(char[] sArr, int start, int end) {
        char temp = sArr[start];
        sArr[start] = sArr[end];
        sArr[end] = temp;
    }

    public String reverseVowels(String s) {
        int start = 0, end = s.length() - 1;
        char[] sArr = s.toCharArray();

        while(start < end) {
            while(start < s.length() && !isVowel(sArr[start])) {
                start++;
            }
            while(end >= 0 && !isVowel(sArr[end])) {
                end--;
            }

            if(start < end) {
                swap(sArr, start++, end--);
            }
        }
        return new String(sArr);
    }
}