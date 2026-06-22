class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length -1;
        int endCol = matrix[0].length -1;
        List<Integer> ans = new ArrayList<>();
        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j = startCol; j <= endCol; j++){
                ans.add(matrix[startRow][j]);
            }
            //rightside
            for(int i = startRow + 1; i <= endRow; i++){
                ans.add(matrix[i][endCol]);
            }
            //bottom
            for(int j = endCol - 1; j >= startCol; j--){
                if(startRow == endRow){
                    return ans;
                }
                ans.add(matrix[endRow][j]);
            }
            //leftside
            for(int i = endRow - 1 ; i >= startRow + 1; i--){
                if(startCol == endCol){
                    return ans;
                }
                ans.add(matrix[i][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return ans;
    }
}