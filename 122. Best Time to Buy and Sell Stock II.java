class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length,profit=0;
        for(int i=1;i<n;i++)
        {
            profit+=Math.max(prices[i]-prices[i-1],0);
        }
         
        return profit;
                
        }
}