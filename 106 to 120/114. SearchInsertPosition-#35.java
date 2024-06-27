class Solution {
    public int searchInsert(int[] nums, int target) {
        return bs(nums, target, 0, nums.length - 1);
    }

    private int bs(int[] nums, int target, int start, int end) {
        if (start > end) {
            return start;
        }
        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return bs(nums, target, start, mid - 1);
        } else {
            return bs(nums, target, mid + 1, end);
        }
    }
}
