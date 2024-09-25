class Solution {
    public int thirdMax(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int n = nums.length;

        for(int i = n - 1; i >= 0; i--) {
            int num = nums[i];
            set.add(num);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int num : set) {
            queue.offer(num);
            if(queue.size() > 3) queue.poll();
        }

        if(queue.size() == 2) queue.poll();

        return queue.peek();
    }
}