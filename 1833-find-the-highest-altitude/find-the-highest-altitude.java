class Solution {
    public int largestAltitude(int[] gain) {
        int maxsum = 0;
        int curr = 0;
        for(int i=0; i<gain.length; i++){
            curr += gain[i];
            maxsum = Math.max(curr,maxsum);
        } 
        return maxsum;
    }
}