class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.length() > magazine.length()) return false;
        int[] alpha_counter = new int[26];
        for (char c : magazine.toCharArray())
            alpha_counter[c-'a']++;
        for (char c : ransomNote.toCharArray()){
            if (alpha_counter[c-'a'] == 0) return false;
            alpha_counter[c-'a']--;
        }
        return true;
    }
}