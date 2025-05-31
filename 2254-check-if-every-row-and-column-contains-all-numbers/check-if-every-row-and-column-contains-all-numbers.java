class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for(int i=0; i<n; i++){
            int[] rowcount = new int[n+1];
            int[] colcount = new int[n+1];

            for(int j=0; j<n; j++){
                int rowval = matrix[i][j];
                int colval = matrix[j][i];

                if(rowval > n || rowval<1 || colval > n || colval < 1 ){
                    return false;
                }
                rowcount[rowval]++;
                colcount[colval]++;

                if(rowcount[rowval] > 1 || colcount[colval] >1){
                    return false;
                }
            }
        }
        return true;
    }
}