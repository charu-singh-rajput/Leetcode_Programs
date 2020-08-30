class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length,start=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=val)
            {
               nums[start]=nums[i];
                start++; 
            }    
        }
        return start;
    }
}