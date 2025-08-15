class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map <Integer,Integer> map = new HashMap<>();
        List <Integer> result = new ArrayList<>();

        for (int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(Integer Key : map.keySet()){
            if(map.get(Key) > nums.length/3 ){
                result.add(Key);
            }
        }
        return result;
    }
}