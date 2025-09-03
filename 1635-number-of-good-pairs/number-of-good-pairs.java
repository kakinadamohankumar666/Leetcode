class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            int seen = freq.getOrDefault(num, 0);
            count += seen;
            freq.put(num, seen + 1);
        }
        return count;
    }
}