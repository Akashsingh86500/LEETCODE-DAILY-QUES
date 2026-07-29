class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(ans.containsKey(target-nums[i])){
                res[0]=ans.get(target-nums[i]);
                res[1]=i;
                break;
            }
            ans.put(nums[i],i);
        }
        return res;    
    }
}