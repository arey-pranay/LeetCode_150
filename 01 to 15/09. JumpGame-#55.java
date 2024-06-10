class Solution {
    public boolean canJump(int[] nums) {
        //the index where I can safely reach if I start reverse
        int lastGoodIndex = nums.length - 1; // Initialize with the last index
        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= lastGoodIndex) {
                lastGoodIndex = i; // Update the last good index
            }
        }
        return lastGoodIndex == 0; // Check if we can reach the start
    }
}
