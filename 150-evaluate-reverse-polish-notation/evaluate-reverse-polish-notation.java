class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")|| tokens[i].equals("-")|| tokens[i].equals("*")|| tokens[i].equals("/")){
                int op1=st.pop();
                int op2=st.pop();
                int val=0;
                if(tokens[i].equals("+")) val=op1+op2;
                if(tokens[i].equals("-")) val=op2-op1;
                if(tokens[i].equals("*")) val=op1*op2;
                if(tokens[i].equals("/")) val=op2/op1;
                st.push(val);
                
            }
            else{
                 int num=Integer.parseInt(tokens[i]);
                 st.push(num);
            }

        }
        return st.pop();
    }
}