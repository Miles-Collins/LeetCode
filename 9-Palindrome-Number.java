class Solution {
    public boolean isPalindrome(int x) {
        String intStr = String.valueOf(x);
        int length = intStr.length();
        for(int i = 0; i < length/2; i++) {
            if(intStr.charAt(i) != intStr.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}