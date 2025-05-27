class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missingcount = 0;
        int current = 1;
        int i = 0;
        while(missingcount < k){
            if(i<arr.length && arr[i] == current){
                i++;
            }else{
                missingcount++;
                if(missingcount == k){
                    return current;
                }
            }
            current++;
        }
        return -1;
    }
}