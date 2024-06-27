class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        if(nums.length==2){
            return nums[0]>nums[1] ? 0 : 1;
        } 
        return bs(nums, 0, nums.length-1);
    }
    public int bs(int[] nums, int start, int end){
        int mid = start + (end-start)/2;
        if(start==end)return start;
        if(nums[mid+1]<nums[mid]){
            return bs(nums, start, mid);
        } else {
            return bs(nums, mid+1, end);
        }
    }
}
