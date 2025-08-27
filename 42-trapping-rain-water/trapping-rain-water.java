class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int res = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                // update leftMax manually
                if (height[left] >= leftMax) {
                    leftMax = height[left];   // new max found
                } else {
                    res += leftMax - height[left]; // water trapped
                }
                left++;
            } else {
                // update rightMax manually
                if (height[right] >= rightMax) {
                    rightMax = height[right];  // new max found
                } else {
                    res += rightMax - height[right]; // water trapped
                }
                right--;
            }
        }
        return res;
    }
}
