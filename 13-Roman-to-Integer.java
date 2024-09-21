class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanToInteger = new HashMap<>();
        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);

        int answer = 0;
        int prev = 0;
        int n = s.length();
        for(int i = n - 1; i >= 0; i--) {
            int numeral = romanToInteger.get(s.charAt(i));

            if(numeral >= prev) {
                answer += numeral;
            } else {
                answer -= numeral;
            }

            prev = numeral;

        }

        return answer;
    }
}