class Solution {
    public long sumDigitDifferences(int[] nums) {
        int n = nums.length;
        int digits = String.valueOf(nums[0]).length();
        long ans = 0;
        for (int pos = 0; pos < digits; pos++) {
            int[] freq = new int[10];
            for (int num : nums) {
                int digit = num % 10;
                freq[digit]++;
                num /= 10;
            }
            for (int f : freq) {
                ans += (long) f * (n - f);
            }

            for (int i = 0; i < n; i++) {
                nums[i] /= 10;
            }
        }
        return ans / 2;
    }
}