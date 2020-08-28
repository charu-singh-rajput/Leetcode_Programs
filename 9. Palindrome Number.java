class Solution {
public:
    bool isPalindrome(int x) {
       int copy=x;
    long int reverse=0;
    
    if(x==0)
        return true;
              
    while(x!=0)
    {
        reverse=reverse*10+x%10;
        x/=10;
    }
    if(reverse!=copy || reverse<0 || reverse > INT_MAX || reverse < INT_MIN)
    {
        return false;
    }
    else
    {
        return true;
    } 
    }
};