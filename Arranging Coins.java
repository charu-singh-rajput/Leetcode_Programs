class Solution {
    public int arrangeCoins(int n) {
        int count=0,copy=n;
        for(int i=0;i<n;i++)
        {
            count=count+1;
            n=n-count;
        }
        if(n!=0)
        {
            return count;
        }
        return count;
    }
}