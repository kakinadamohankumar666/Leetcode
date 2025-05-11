class Solution {
    public int maxSubArray(int[] nums) {
        int ms = nums[0];
        int cs = nums[0];
        for(int i=1; i<nums.length; i++){
            cs = Math.max(cs+nums[i],nums[i]);
            ms = Math.max(cs,ms);
        }
    return ms;
}
}