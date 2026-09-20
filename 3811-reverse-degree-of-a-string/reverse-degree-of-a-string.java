class Solution {
    public int reverseDegree(String s) {
      int sum=0;
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        int rev=26-(c-'a');
        int index=i+1;
        sum+=rev*index;
      } 
      return sum; 
    }
}