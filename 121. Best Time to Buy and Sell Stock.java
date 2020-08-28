class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length,m=0,m1=0,i=1;
        
        for(;i<n;i++)
        {
            m=Math.max(0,m+=prices[i]-prices[i-1]);
            m1=Math.max(m1,m);
        }
        return m1;
        
    }
}