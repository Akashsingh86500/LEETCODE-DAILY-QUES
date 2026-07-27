class Solution {
    public int maxProduct(int[] nums) {
    int max=Integer.MIN_VALUE;
    int cmax=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            cmax=max;
            max=nums[i];
            //cmax=max;
        }
        else if(nums[i]>cmax){
            cmax=nums[i];
        }
    }
    return (max-1)*(cmax-1);    
    }
}