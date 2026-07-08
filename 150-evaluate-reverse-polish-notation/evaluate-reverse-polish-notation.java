class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String token: tokens){
            switch(token){
                case "+":
                    st.push(st.pop()+st.pop());
                    break;
                case "-":
                   int a = st.pop();
                   int b = st.pop();
                    st.push(b - a);
                    break;
                case "*":
                    st.push(st.pop()*st.pop());
                    break;
                case "/":
                    a = st.pop();
                    b = st.pop();
                    st.push(b / a);
                    break;
                default:
                    st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}