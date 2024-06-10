class Solution {
    public int maxProfit(int[] prices) {
        int currP = 0;
        int bp = prices[0];
        for(int i=1;i<prices.length;i++){
            bp = Math.min(bp,prices[i]);
            currP = Math.max(prices[i]-bp,currP);
        }
        return currP;
    }
}
