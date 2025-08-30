class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int prefix = 0;
        int maxlength = 0;
        for (int i=0; i<nums.length; i++) {
            prefix += (nums[i] == 0 ? -1 : 1);
            if (map.containsKey(prefix)) {
                maxlength = Math.max(maxlength, i - map.get(prefix));
            } else {
                map.put(prefix, i);
            }
        }
        return maxlength;
    }
}