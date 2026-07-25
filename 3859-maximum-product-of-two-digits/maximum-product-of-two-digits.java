class Solution {
    public int maxProduct(int n) {
        int max=Integer.MIN_VALUE;
        int cmax=Integer.MIN_VALUE;
        while(n>0){
            int d=n%10;
            if(d>max){
                cmax=max;
                max=d;
            }
            else if(d>cmax){
                cmax=d;
            }
            n/=10;
        }
        return cmax*max;
    }
}