// class Solution {
//     class Pair{
//         int i;
//         int j;
//         Pair(int i, int j){
//             this.i = i;
//             this.j = j;
//         }
//     }
//     public int numIslands(char[][] grid) {
//         int count = 0;
//         Queue<Pair> q = new LinkedList<>();
//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[0].length;j++){
//                 if(grid[i][j]=='1'){
//                     Pair p = new Pair(i,j);
//                     q.add(p);
//                     count = check(grid,i,j,count, q);
//                 } 
//             }
//         }
//         return count;
//     }
//     public int check(char[][] grid, int i, int j, int count, Queue<Pair> q){
//         grid[i][j]='0';
//         if(j!= grid[0].length-1 && grid[i][j+1] == '1'){
//             q.add(new Pair(i,j+1));
//         } //right
//         if(j!= 0 && grid[i][j-1]=='1'){
//             q.add(new Pair(i,j-1));
//         } //left
//         if(i!= grid.length-1 && grid[i+1][j]=='1'){
//             q.add(new Pair(i+1,j));
//         } //down
//         if(i!= 0 && grid[i-1][j]=='1'){
//             q.add(new Pair(i-1,j));
//         } //up
//         while(!q.isEmpty()){
//             Pair p = q.remove();
//             check(grid, p.i, p.j,count,q);
//         }
//         count++;
//         return count;
//     }
// }

// class Solution {
//     class Pair {
//         int i, j;
//         Pair(int i, int j) {
//             this.i = i;
//             this.j = j;
//         }
//     }
    
//     public int numIslands(char[][] grid) {
//         int count = 0;
//         Queue<Pair> q = new LinkedList<>();
//         for (int i = 0; i < grid.length; i++) {
//             for (int j = 0; j < grid[0].length; j++) {
//                 if (grid[i][j] == '1') {
//                     q.add(new Pair(i, j));
//                     check(grid, q);
//                     count++; // increment count for each island
//                 }
//             }
//         }
//         return count;
//     }

//     public void check(char[][] grid, Queue<Pair> q) {
//         int[] dX = {0, 0, 1, -1}; // directions for right, left, down, up
//         int[] dY = {1, -1, 0, 0}; // directions for right, left, down, up
        
//         while (!q.isEmpty()) {
//             Pair p = q.poll();
//             int x = p.i, y = p.j;
//             grid[x][y] = '0'; // mark as visited
            
//             for (int d = 0; d < 4; d++) {
//                 int newX = x + dX[d], newY = y + dY[d];
//                 if (isValid(grid, newX, newY)) {
//                     q.add(new Pair(newX, newY));
//                     grid[newX][newY] = '0'; // mark as visited
//                 }
//             }
//         }
//     }
    
//     public boolean isValid(char[][] grid, int x, int y) {
//         return x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] == '1';
//     }
// }






class Solution {
    int rows;
    int cols;
    int isLands = 0;
    public int numIslands(char[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        for(int row =0; row< rows; row++){
            check(grid, row);
        }
        return isLands;
    }

    public void check(final char[][] grid,int row ){
        final char[] finalRow = grid[row];
        for(int col =0; col< cols; ++col){
            if(finalRow[col] == '1'){
                bfs(grid, row, col);
                ++isLands;
            }
        }
    }

    public void bfs(final char[][] grid,int row, int col){
        grid[row][col] = '2';
        if(row > 0 && grid[row-1][col] == '1'){
            bfs(grid, row-1, col);
        }
         if(row+1 < rows && grid[row+1][col] == '1'){
            bfs(grid, row+1, col);
        }
         if(col > 0 && grid[row][col - 1] == '1'){
            bfs(grid, row, col-1);
        }
         if( col + 1 < cols && grid[row][col+1] == '1'){
            bfs(grid, row, col+1);
        }
    }
}
