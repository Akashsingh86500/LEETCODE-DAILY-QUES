class Solution {
    public int minimumPushes(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            if(i<8) c++;
            else if(i>=8 && i<16){
                c+=2;
            }
            else if(i>=16 && i<24){
                c+=3;
            }
            else {
                c+=4;
            }
        }
        return c;
    }
}