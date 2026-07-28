class Solution {
    public String reverse(String s){
            StringBuilder sb=new StringBuilder();
            sb.append(s);
            sb.reverse();
            return sb.toString();
        }
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set=new HashSet<>();
        int l=words.length;
        int count=0;
        for(int i=0;i<l;i++){
            if(set.contains(reverse(words[i]))) count++;
            set.add(words[i]);
        }
        return count;
    }
}