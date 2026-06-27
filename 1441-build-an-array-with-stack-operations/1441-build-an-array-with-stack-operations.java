class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> answer = new ArrayList<String>();
        int currentIndex = 0;
        for (int i = 1; i <= n; i++) {
            if (currentIndex >= target.length) {
                break;
            }

            if (target[currentIndex] == i) {
                answer.add("Push");
                currentIndex++;
            } else {
                answer.add("Push");
                answer.add("Pop");
            }
        }
        return answer;
    }
}