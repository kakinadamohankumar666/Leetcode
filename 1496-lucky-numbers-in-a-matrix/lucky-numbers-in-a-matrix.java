class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List <Integer> result = new ArrayList<>();

        int rows = matrix.length;
        int col = matrix[0].length;

        for(int i=0; i<rows; i++){
            int rowMin = matrix[i][0];
            int colIndex = 0;
            for(int j=1; j<col; j++){
                if(matrix[i][j] < rowMin){
                    rowMin = matrix[i][j];
                    colIndex = j;
                }
            }
            boolean isMaxInCol = true;
            for(int k=0; k<rows; k++){
                if(matrix[k][colIndex] > rowMin){
                    isMaxInCol = false;
                    break;
                }
            }
            if(isMaxInCol){
                result.add(rowMin);
            }

        }
        return result;
    }
}