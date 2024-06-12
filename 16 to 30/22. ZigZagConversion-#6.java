class Solution {
    public String convert(String s, int numRows) {
        // Get the length of the input string
        int length = s.length();
        // If there's only one row or the number of rows is the same as the length of the string, return the string as is
        if (numRows == 1 || numRows == length) return s;
        
        // Create a character array to store the result
        char[] ans = new char[length];
        // Variable to keep track of the position in the result array
        int count = 0;
        // The step size between characters in the same column for the first and last rows
        int inc = 2 * (numRows - 1);

        // Loop through each row
        for (int i = 0; i < numRows; i++) {
            // Start at the current row
            int j = i;
            // Continue looping while within the bounds of the string
            while (j < length) {
                // Place the current character in the result array
                ans[count++] = s.charAt(j);
                // If we are in the first or last row, move to the next character in the same column
                if (i == 0 || i == numRows - 1) j += inc;
                else {
                    // For middle rows, calculate the next position by skipping the appropriate number of characters
                    j += (inc - (2 * i));
                    // If within bounds, place the character in the result array
                    if (j < length) {
                        ans[count++] = s.charAt(j);
                        // Move to the next character in the same column for middle rows
                        j += (2 * i);
                    }
                }
            }
        }

        // Convert the character array to a string and return
        return new String(ans);
    }
}
