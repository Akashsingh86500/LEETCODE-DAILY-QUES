class Solution {
    public int subtractProductAndSum(int n) {
        int rem=0;
        int prod=1;
        int sum=0;
        while(n!=0){
            rem=n%10;
            sum+=rem;
            prod*=rem;
            n/=10;
        }
        int diff=prod-sum;
        return diff;
    }
}