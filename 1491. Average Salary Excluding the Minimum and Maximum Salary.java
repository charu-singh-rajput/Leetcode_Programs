class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int n=salary.length;
        double total=0.0;
        int count=0;
            for(int i=1;i<n-1;i++)
        {
            total=total+salary[i];
                count++;
        }
        double sal=total/count;
        return sal;
            
    }
}