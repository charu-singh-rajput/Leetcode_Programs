class Solution {
    public double angleClock(int hour, int minutes) {
        double hour_result=(hour*30) + (minutes*0.5);
        double minute_result=minutes*6;
        double result=hour_result-minute_result;
        double res=Math.abs(result);
        if(res <= 180.0)
        {
            return res;
        }
        else
        {
            return 360.0-res;
        }
        
    }
}