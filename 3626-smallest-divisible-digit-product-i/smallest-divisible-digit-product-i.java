class Solution {

    public int digit(int x){
        int mul=1;
        while(x>0){
            int m=x%10;
            x/=10;
            mul=m*mul;
        }
        return mul;
    }
    public int smallestNumber(int n, int t) {
        //int mul=1;
        if(digit(n)%t==0) return n;
        else{
            for(int i=1;i<10;i++){
            n=n+1;
            if(digit(n)%t==0)return n;
            }
        }
        return n;
        
    }
    
}