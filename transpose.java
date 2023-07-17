class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;

        transpose(matrix,row,col);
        for(int i=0;i<row;i++){
            for(int j=0;j<col/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][col-j-1];
                matrix[i][col-1-j]=temp;
            }
        }
      
    }
    public void transpose(int[][] matrix,int row,int col){
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}
