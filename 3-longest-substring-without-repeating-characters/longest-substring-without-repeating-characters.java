class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int start=0;
        int end =0;
        int maxl=0;
        Set<Character> charset=new HashSet<>();
        while(start<n && end<n){
            if(!charset.contains(s.charAt(end))){
                charset.add(s.charAt(end));
                end++;
                maxl=Math.max(maxl,end-start);
            }
            else{
                charset.remove(s.charAt(start));
                start++;
            }
        }
        return maxl;  
    }
}