class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        
        int mini=0;
        
        for(int i=0;i<nums.length-1;i+=2)
        {
            mini+=nums[i];
        }
       return mini;     
    }
}