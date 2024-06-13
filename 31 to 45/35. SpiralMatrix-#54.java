
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>(); // List to store the spiral order
        if (matrix == null || matrix.length == 0) return result;

        int m = matrix.length; // Number of rows
        int n = matrix[0].length; // Number of columns

        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        while (result.size() < m * n) {
            // Traverse from left to right along the top row
            for (int j = left; j <= right && result.size() < m * n; j++) {
                result.add(matrix[top][j]);
            }
            top++; // Move the top boundary down

            // Traverse from top to bottom along the right column
            for (int i = top; i <= bottom && result.size() < m * n; i++) {
                result.add(matrix[i][right]);
            }
            right--; // Move the right boundary left

            // Traverse from right to left along the bottom row
            for (int j = right; j >= left && result.size() < m * n; j--) {
                result.add(matrix[bottom][j]);
            }
            bottom--; // Move the bottom boundary up

            // Traverse from bottom to top along the left column
            for (int i = bottom; i >= top && result.size() < m * n; i--) {
                result.add(matrix[i][left]);
            }
            left++; // Move the left boundary right
        }

        return result; // Return the list containing the spiral order
    }
}
