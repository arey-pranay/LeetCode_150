import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Check rows
        for (int i = 0; i < 9; i++) {
            HashSet<Character> rowSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];
                if (current != '.' && !rowSet.add(current)) {
                    return false; // Duplicate in row
                }
            }
        }

        // Check columns
        for (int j = 0; j < 9; j++) {
            HashSet<Character> colSet = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                char current = board[i][j];
                if (current != '.' && !colSet.add(current)) {
                    return false; // Duplicate in column
                }
            }
        }

        // Check 3x3 subgrids
        for (int block = 0; block < 9; block++) {
            HashSet<Character> blockSet = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = 3 * (block / 3) + i;
                    int col = 3 * (block % 3) + j;
                    char current = board[row][col];
                    if (current != '.' && !blockSet.add(current)) {
                        return false; // Duplicate in 3x3 subgrid
                    }
                }
            }
        }

        return true; // No duplicates found, Sudoku is valid
    }

}
