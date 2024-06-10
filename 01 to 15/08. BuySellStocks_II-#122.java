class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int start = prices[0];
        int sz = prices.length;
        for(int i = 1;i<sz; i++){
            if(start < prices[i]) profit += prices[i] - start; //if there is a profit, then sell it and add it to the total profit
            start = prices[i]; //now we will buy again on the next day
        }
        return profit;
    }
}
