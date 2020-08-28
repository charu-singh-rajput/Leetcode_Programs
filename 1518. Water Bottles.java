class Solution {
public:
    int numWaterBottles(int numBottles, int numExchange) {
        int temp=0,copy=numBottles,remain=0,filled=0,answer=0;
   while(numBottles>=numExchange)
    {
       remain=numBottles%numExchange;
       numBottles=numBottles-remain;
       filled=numBottles/numExchange;
       answer=answer+filled;
       numBottles=filled+remain;
    }
    
    return answer+copy;
    }
};