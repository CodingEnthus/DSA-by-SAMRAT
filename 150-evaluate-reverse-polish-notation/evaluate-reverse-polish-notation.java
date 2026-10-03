class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String str:tokens){
            switch(str){
                case "+":
                    st.push(st.pop()+st.pop());
                    break;
                case "-":
                    int a=st.pop();
                    int b=st.pop();
                    st.push(b-a);
                    break;
                case "*":
                    st.push(st.pop()*st.pop());
                    break;
                case "/":
                    a=st.pop();
                    b=st.pop();
                    if(a!=0){
                        st.push(b/a);
                    }
                    break;
                default:
                    st.push(Integer.parseInt(str));
            }
        }
        return st.pop();
    }
}

