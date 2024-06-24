class Solution {
    public boolean isPalindrome(int x) {
        if(x==0) return true;
        if(x<0 || x%10==0) return false;
        int ans = 0;
        int temp = x;
        while(temp!=0){
            int ld = temp%10;
            ans = ans*10+ld;
            temp /= 10;
        }
        if(x==ans){
            return true;
        }else{
            return false;
        }
    }
}
