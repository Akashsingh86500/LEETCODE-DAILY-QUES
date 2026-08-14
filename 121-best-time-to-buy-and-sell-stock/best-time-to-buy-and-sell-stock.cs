public class Solution {
    public int MaxProfit(int[] nums) {
        int buy=nums[0];
        int max=0;
        for(int i=1;i<nums.Length;i++){
            buy=Math.Min(nums[i],buy);
            if(nums[i]>buy){
                max=Math.Max(nums[i]-buy,max);
            }   
            
        }
        return max;
    }
}