class Solution {
    public void gameOfLife(int[][] board) {
        // 2 se km zinda neighbour => 0; //underpopulation
        // 2 ya 3 zinda neighbour => 1;
        // 3 se zyada neighbour zinda => 0 //overpopulation
        // 3 neighbour zinda => 1 //reproduction
        int m = board.length;
        int n = board[0].length;
        int[][] curr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                curr[i][j] = checkN(board, i, j);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = curr[i][j];
            }
        }
    }

    public static int checkN(int[][] board, int i, int j){
        int m = board.length;
        int n = board[0].length;
        int count = 0;
        int[][] posn = {
                           { i, j+1},
                           { i+1, j+1},
                           { i+1, j},
                           { i+1, j-1},
                           { i, j-1},
                           { i-1, j-1},
                           { i-1, j},
                           { i-1, j+1},
        };
        for(int[] pos : posn){
            int x = pos[0];
            int y = pos[1];
            if(x<m && y<n && x>=0 && y>=0 && board[x][y]==1) count++;
        }
        if(board[i][j]==0 && count == 3) return 1;
        if(board[i][j]==1 && (count == 3 || count ==2)) return 1;
        return 0;
    }
}
