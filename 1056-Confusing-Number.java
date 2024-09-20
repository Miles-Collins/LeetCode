class Solution {
    public boolean confusingNumber(int n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(c == '2' || c == '3' || c == '4' || c == '5' || c == '7') {
                return false;
            } else if (c == '6') {
                sb.append('9');
            } else if (c == '9') {
                sb.append('6');
            } else {
                sb.append(c);
            }
        }
        return !sb.reverse().toString().equals(s);
    }
}