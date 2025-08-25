class Solution {
    public int majorityElement(int[] nums) {
        int candit = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candit = nums[i];
            }
            if (candit == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return candit;

    }
}