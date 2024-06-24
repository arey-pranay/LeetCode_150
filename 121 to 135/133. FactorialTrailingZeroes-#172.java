class Solution {
    public int trailingZeroes(int n) {
        int count =0;
        int j =1;
        while(n >= Math.pow(5,j)){
            count += n/Math.pow(5,j);
            j++;
        }
        return count;
    }
}
