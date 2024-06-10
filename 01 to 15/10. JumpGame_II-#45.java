class Solution {
    int ans = 0; //number of jumps till now

    public int jump(int[] nums) {
        int i = 0;
        //start from the 0th index and call helper function after each jump till you reach the end
        while (i < nums.length - 1) {
            i = helper(i, nums[i], nums);
        }
        //ans is the number of times the function was called, or the number of jumps
        return ans;
    }

    public int helper(int a, int b, int[] nums) {
        ans++;
        if (a + b >= nums.length - 1) { //if the current position plus current max jump exceeds the boundary, then it means you can reach the end in this call, so you can return last index to your function call
            return nums.length;
        }
        int max = Integer.MIN_VALUE;
        int temp = 0;

        for (int i = a; i <= a + b; i++) { //a+b is the  max pos you can reach from a
            //a se a+b tk har stage pe jaake dekhna hai max forward kisse ja skte hai
            if (nums[i] + i >= max) {
                temp = i;
                max = nums[i] + i;
            }
        }
        //temp was assigned the value of i when i denoted the position jahan max update hua tha
        return temp;
    }
}
