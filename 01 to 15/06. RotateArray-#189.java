class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1); //reverse the entire array
        reverse(nums, 0, k-1); //reverse from 0 to k
        reverse(nums, k, nums.length - 1); //reverse from k to end
    }
      public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
// class Solution {
//     public void rotate(int[] nums, int k) {
//         int sz = nums.length;
//         k %= sz;
//         int[] temp = new int[k];
//         for(int i=sz-k;i<sz;i++) temp[i-(sz-k)] = nums[i];
//         for(int i=sz-1;i>=k;i--) nums[i] = nums[i-k];
//         for(int i=0;i<k;i++)nums[i]=temp[i];
//     }
// }
