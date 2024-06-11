class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sz = nums.length;
        int[] pre = new int[sz];
        int[] suf = new int[sz];
        pre[0] = 1;
        suf[sz-1] = 1;
        for(int i=1;i<sz;i++){
            pre[i] = pre[i-1] * nums[i-1] ;
            suf[sz-i-1] = suf[sz-i] * nums[sz-i];
        }
        for(int i=0;i<sz;i++){
            pre[i] *= suf[i];
        }
        return pre;
    }
}
