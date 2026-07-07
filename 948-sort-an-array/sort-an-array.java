class Solution {
    public int[] conquer(int nums[] , int start , int mid , int end){
        int idx1=start;
        int idx2=mid+1;
        int c[]= new int[end-start+1];
        int k=0;
        while(idx1<=mid && idx2<=end){
            if(nums[idx1]<=nums[idx2]){
                c[k++]=nums[idx1++];
            }
            else{
                c[k++]=nums[idx2++];
            }
        }
        while(idx1<=mid){
            c[k++]=nums[idx1++];
        }
        while(idx2<=end){
            c[k++]=nums[idx2++];
        }
        for(int i =0;i<c.length;i++){
            nums[start+i]=c[i];
        }
        return nums;
    }
    public int[] divide(int nums[], int start , int end){
        if(start>=end){
            return nums;
        }
        int mid = start+(end-start)/2;
        divide(nums,start,mid);
        divide(nums,mid+1,end);
        return conquer(nums, start, mid, end);
    }
    public int[] sortArray(int[] nums) {
        return divide(nums,0,nums.length-1);
    }
}