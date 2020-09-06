class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length-1,i=0,sum=0,min=Integer.MAX_VALUE,close=0;
        Arrays.sort(nums);
        
        for(i=0;i<n-1;i++)
        {
            int j=i+1,k=nums.length-1;
            while(j<k)
            {
               sum=nums[i]+nums[k]+nums[j];
                if(sum==target)
                    return sum;
                if(sum<target)
                    j++;
                else
                    k--;
                
                int difference=Math.abs(sum-target);
                
                if(difference<min)
                {
                    min=difference;
                    close=sum;
                }
            }
        }
            
        return close;
    }
}


/*Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

 

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 

Constraints:

3 <= nums.length <= 10^3
-10^3 <= nums[i] <= 10^3
-10^4 <= target <= 10^4*/