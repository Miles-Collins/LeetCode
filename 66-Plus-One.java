class Solution {
    public int[] plusOne(int[] digits) {
        int prev = 1;
        for(int i = digits.length-1; i>=0; i--) {
            if(digits[i] + prev > 9) {
                digits[i] = (digits[i] + prev) % 10;
                prev = 1;
            } else {
                digits[i] = (digits[i] + prev) % 10;
                prev = 0;
            }
        }

        int[] sum = new int[digits.length+1];
        if(prev == 0)
            return digits;
        sum[0] = prev;
        for(int i=1; i< sum.length;i++) {
            sum[i] = digits[i-1];
        }
        return sum;
    }
}