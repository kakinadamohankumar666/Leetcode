class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int size = grid.length*grid[0].length;
        int[] ans  = new int[2];
        int[] count = new int[size+1];
        for(int i=0; i<grid.length; i++){
            for(int j =0; j<grid[0].length; j++){
                int val = grid[i][j];
                count[val]++;
            }
        }
        
        for (int num = 1; num <= size; num++) {
            if (count[num] == 2) {
                ans[0] = num;  // repeated
            } else if (count[num] == 0) {
                ans[1] = num;  // missing
            }
        }

        return ans;

    }
}