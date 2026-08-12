class Solution {
    public static String reverse(String s) {
        char[] arr = s.toCharArray();
        int j = 0;
        int k = arr.length - 1;
        while (j < k) {
            char temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;
            j++;
            k--;
        }
        return new String(arr);
    }
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String ans = "";
        for (int i = 0; i < words.length; i++) {
            ans += reverse(words[i]);
            if (i != words.length - 1) {
                ans += " ";
            }
        }
        return ans;
    }
}