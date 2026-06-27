class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> answer = new ArrayList<String>();
        int currentIndex = 0;

        for(int i = 1; i <= n; i++) {
            if(currentIndex >= target.length) {
                break;
            }

            answer.add("Push");

            if(target[currentIndex] == i) {
                currentIndex++;
            } else {
                answer.add("Pop");
            }
        }
        return answer;
    }
}