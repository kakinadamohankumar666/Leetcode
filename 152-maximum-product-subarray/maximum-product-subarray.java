class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int currmax = nums[0];
        int currmin = nums[0];
        for(int i=1; i<nums.length; i++){
            int temp = currmax;
            currmax = Math.max(nums[i],Math.max(currmax*nums[i],nums[i]*currmin));
            currmin = Math.min(nums[i],Math.min(temp*nums[i],nums[i]*currmin));
            res = Math.max(res,currmax);
        }
        return res;
    }
}