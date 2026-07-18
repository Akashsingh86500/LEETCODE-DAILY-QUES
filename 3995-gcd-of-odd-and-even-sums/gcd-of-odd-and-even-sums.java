class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd=0;
        int sumeven=0;
        int count=0;
        for(int i=1;;i++){
            if(i%2==0){
                
                sumeven+=i;
                count++;
                if(count==n)break;
            }
            else{
                sumodd+=i;
            }
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        min=Math.min(sumodd,sumeven);
        max=Math.max(sumodd,sumeven);
        for(int i=min;i>0;i--){
            if(max%i==0 && min%i==0){
                return i;
            }
        }
        return 1;


    }
}