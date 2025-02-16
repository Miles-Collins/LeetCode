class Solution {
    public boolean isPalindrome(int x) {
        String intArr = Integer.toString(x);
        int length = intArr.length();
        for(int i = 0; i < length / 2; i++) {
            if(intArr.charAt(i) != intArr.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}