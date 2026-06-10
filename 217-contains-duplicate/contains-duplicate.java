class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h= new HashSet<>();
        for(Integer i:nums){
            h.add(i);
        }
        int l=nums.length;
        int s=h.size();
        if(l==s){
            return false;
        }
        else{
            return true;
        }


        
    }
}