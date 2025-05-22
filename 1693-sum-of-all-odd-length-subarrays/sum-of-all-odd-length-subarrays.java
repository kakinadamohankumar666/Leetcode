class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int length = j -i  + 1;
                for(int k=i; k<=j; k++){
                    if(length%2 == 1 ){
                        count += arr[k];
                    }
                }
            }
        }
        return count;
    }
}