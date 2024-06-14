class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> h = new HashSet<>();
        int prod = n;
        while(true){
            prod = calc(prod);
            if(prod==1) return true;
            if(!h.contains(prod))h.add(prod);
            else return false;
        }
    }
    public int calc(int n){
        int prod = 0;
        while(n>0){
            prod += ((n%10)*(n%10)); //Math.pow(n%10,2)
            n /= 10;
        }
        return prod;
    }
}
