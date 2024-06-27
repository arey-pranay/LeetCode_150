class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length-1;
        int n = matrix[0].length-1;
        int i = 0;
        int j = n;
        while(i<=m &&j<=n &&i>=0 && j>=0){
            if(matrix[i][j]==target) return true;

            //agar bada hai to necche jao
            else if(matrix[i][j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        return false;

    }
}
