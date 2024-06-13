import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Map to keep track of the last seen index of each character
        Map<Character, Integer> lastSeen = new HashMap<>();
        
        // Variable to store the maximum length of substring without repeating characters
        int maxLength = 0;
        
        // Start index of the current window
        int start = 0;
        
        // Iterate over the string with the end index
        for (int end = 0; end < s.length(); end++) {
            // Get the current character at the end index
            char currentChar = s.charAt(end);
            
            // If the character was seen before, update the start index
            if (lastSeen.containsKey(currentChar)) {
                // Move the start to one past the last seen index of the current character
                start = Math.max(start, lastSeen.get(currentChar) + 1);
            }
            
            // Update the last seen index of the current character
            lastSeen.put(currentChar, end);
            
            // Update the maximum length of substring found so far
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        // Return the maximum length of substring without repeating characters
        return maxLength;
    }
}
