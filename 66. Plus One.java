class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length-1;
        for(int i=n;i>=0;i--)
        {
            if(digits[i]!=9)
            {
                digits[i]++;
                break;
            }     
            else
            {
               digits[i]=0; 
            }      
        }
        if(digits[0]==0)
        {
          int[] result=new int[n+2];
            result[0]=1;
            return result;  
        }   
        return digits;
    }
}
/*Given a non-empty array of digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Example 3:

Input: digits = [0]
Output: [1]*/