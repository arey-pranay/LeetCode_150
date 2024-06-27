class Solution {
    public int findMin(int[] nums) {
        return nums[brk(nums,0,nums.length-1)];
    }
    public int brk(int[] nums, int start, int end){
        if(start==end) return start;
        int mid = start + (end-start)/2;
        if(nums[mid]>nums[end]) return brk(nums,mid+1,end);
        return brk(nums,start,mid);
    }
}
