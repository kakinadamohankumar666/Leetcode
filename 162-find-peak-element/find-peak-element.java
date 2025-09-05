class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] > nums[mid + 1]) {
                // Peak is on the left side (mid could be the peak too)
                right = mid;
            } else {
                // Peak is on the right side
                left = mid + 1;
            }
        }
        
        // left == right, this is the peak index
        return left;
    }
}
