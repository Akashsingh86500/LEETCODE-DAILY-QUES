class Solution {
    public int firstUniqueEven(int[] nums) {
        int m = nums[0];
        for (int i = 1; i < nums.length; i++) {
            m = Math.max(m, nums[i]);
        }
        int[] freq = new int[m + 1];
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        for (int i=0;i<nums.length;i++) {
            if (nums[i] % 2 == 0 && freq[nums[i]] == 1) {
                return nums[i];
            }
        }
        return -1;
    }
}