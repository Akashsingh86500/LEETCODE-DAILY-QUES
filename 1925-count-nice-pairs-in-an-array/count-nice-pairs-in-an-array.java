class Solution {
    public int rev(int n){
        int rem=0;
        while(n>0){
            rem=rem*10+n%10;
            n/=10;
        }
        return rem;
    }
    public int countNicePairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            int r=nums[i]-rev(nums[i]);
            if(map.containsKey(r)){
                int freq=map.get(r);
                count +=map.get(r);
                count%=1000000007;
                map.put(r,freq+1);
                
                //map.put(r,freq+1);
                //count+=val;
            }
            else map.put(r,1);
        }
        return count;
    }
}