class Solution {
    public int search(int[] nums, int target) {
      int rotIndex = brk(nums,0,nums.length-1);
      if(nums[rotIndex]==target) return rotIndex;
      if(rotIndex==0) return bs(nums,target,0, nums.length-1);
      if(target>=nums[0]) return bs(nums,target,0,rotIndex);
      return bs(nums, target, rotIndex, nums.length-1);
    }
    public int brk(int[] nums, int start, int end){
        if(start==end) return start;
        int mid = start + (end-start)/2;
        if(nums[mid] > nums[end])
            return brk(nums, mid+1, end);
        else
            return brk(nums, start, mid);
    }
     private int bs(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
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
