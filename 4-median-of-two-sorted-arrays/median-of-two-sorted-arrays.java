class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] merged = new int[n + m];

        // Copy elements of nums1 and nums2 into merged array
        for (int i = 0; i < n; i++) {
            merged[i] = nums1[i];
        }
        for (int i = 0; i < m; i++) {
            merged[n + i] = nums2[i];
        }

        // Sort the merged array
        Arrays.sort(merged);

        // Find and return the median
        int total = n + m;
        if (total % 2 == 1) {
            return merged[total / 2]; // Odd case
        } else {
            return (merged[(total / 2) - 1] + merged[total / 2]) / 2.0; // Even case
        }
    }
}
