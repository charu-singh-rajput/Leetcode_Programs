class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,max=Integer.MIN_VALUE;
        if(height.length==1)
        {
            return 0;
        }
        while(i<j)
        {
                int min=Math.min(height[i],height[j]);
                max=Math.max(max,min*(j-i));
            
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return max;
    }
}

/*Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.

 


 array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

 

Example:

Input: [1,8,6,2,5,4,8,3,7]
Output: 49*/