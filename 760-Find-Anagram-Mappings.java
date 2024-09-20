class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> numberMap = new HashMap();
        for(int i = 0; i < nums2.length; i++) {
            if(!numberMap.containsKey(nums2)) {
                numberMap.put(nums2[i], i);
            }
        }
        for(int i = 0; i < nums1.length; i++) {
            nums1[i] = numberMap.get(nums1[i]);
        }
        return nums1;
    }
}