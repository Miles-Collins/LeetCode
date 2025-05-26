class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        // Ensure binary search is on the smaller array for efficiency.
        if (nums1.size() > nums2.size()) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.size(), n = nums2.size();
        int left = 0, right = m;

        // Binary search begins
        while (left <= right) {
            // Choose a partition point in the smaller array
            int partitionA = (left + right) / 2;

            // Based on partitionA, calculate where to partition in nums2 so left and right sides are balanced
            int partitionB = (m + n + 1) / 2 - partitionA;

            // Determine the largest value on the left side of the partition in nums1
            int maxLeftA = (partitionA == 0) ? INT_MIN : nums1[partitionA - 1];

            // Determine the smallest value on the right side of the partition in nums1
            int minRightA = (partitionA == m) ? INT_MAX : nums1[partitionA];

            // Repeat the same for nums2
            int maxLeftB = (partitionB == 0) ? INT_MIN : nums2[partitionB - 1];
            int minRightB = (partitionB == n) ? INT_MAX : nums2[partitionB];

            // Check if partitions are correct (everything on the left is <= everything on the right)
            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                // If total length is even, return average of max left and min right
                if ((m + n) % 2 == 0) {
                    // TODO: What does this return and why is it correct for even-length combined arrays?
                    return (max(maxLeftA, maxLeftB) + min(minRightA, minRightB)) / 2.0;
                } else {
                    // TODO: Why is this the correct median for odd-length arrays?
                    return max(maxLeftA, maxLeftB);
                }
            } 
            // If left partition of A is too big, move search left
            else if (maxLeftA > minRightB) {
                // TODO: What direction is the binary search moving here, and why?
                right = partitionA - 1;
            } 
            // If left partition of A is too small, move search right
            else {
                // TODO: What does adjusting left like this accomplish?
                left = partitionA + 1;
            }
        }

        // TODO: When will this return line actually be reached?
        return 0.0;
    }
};
