class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Handle edge case for empty array

        int index = 1; // Pointer for the next position to place a valid element
        int count = 1; // Count occurrences of the current number
        int curr = nums[0]; // The current element being checked

        for (int i = 1; i < nums.length; i++) {
            //for maintaining the count and current variable
            if (nums[i] == curr) {
                count++;
            } else {
                curr = nums[i];
                count = 1;
            }
            //for re-assigning values and handling the index of new element
            if (count <= 2) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}
