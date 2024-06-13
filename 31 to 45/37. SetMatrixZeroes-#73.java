class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer[]> a= new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    Integer[] t = new Integer[2];
                    t[0] = i;
                    t[1] = j;
                    a.add(t);
                }
            }
        }
        for(Integer[] i : a){
            setRowZero(matrix, i[0]);
            setColZero(matrix, i[1]);
        }
    }
    public static void setRowZero(int[][] matr, int row){
        for(int i=0;i<matr[0].length;i++) matr[row][i] = 0;
    }
    public static void setColZero(int[][] matr, int col){
        for(int i=0;i<matr.length;i++) matr[i][col] = 0;
    }
}
