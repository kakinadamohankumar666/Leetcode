class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0; // farthest index we can reach

        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) {
                // If current index is beyond farthest, we can't move further
                return false;
            }
            // update farthest reach
            farthest = Math.max(farthest, i + nums[i]);

            // if we can reach or pass last index
            if (farthest >= nums.length - 1) {
                return true;
            }
        }
        return true; // if loop completes without issues
    }
}
