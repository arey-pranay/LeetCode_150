class Solution {
    public int[] searchRange(int[] nums, int target) {  
        if(nums.length==1){
            if(nums[0]==target) return new int[]{0,0};
            return new int[]{-1,-1};  
        } 
        return bs(nums,target,0,nums.length-1);
    }
    public int[] bs(int[] nums, int target, int start, int end){
        if(start>end) return new int[]{-1,-1};
        int mid = start + (end-start)/2;
        if(nums[mid]==target){

            int s = mid;
            int e = mid;
            int i=1;
            while( mid+i<=nums.length-1 && nums[mid+i]==nums[mid] )i++;
            if(i!=1) e = mid+i-1;
            i =1;
            while( mid-i>=0 && nums[mid-i]==nums[mid])i++;
            if(i!=1) s = mid-i+1;

            return new int[]{s,e};
        }
        else if(target<nums[mid]){
            return bs(nums,target, start,mid-1);
        } else{
            return bs(nums,target,mid+1,end);
        }
    }
}
