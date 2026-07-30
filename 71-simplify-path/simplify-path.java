class Solution {
    public String simplifyPath(String path) {
       Stack<String> st=new Stack<>();
       String[] elements=path.split("/");
       for(String e: elements){
        System.out.print(e+" ");
       }
       for(String e:elements){
            if(e.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else if(e.equals(".") || e.equals("")) continue;
            else{
                st.push(e);
            }
        }
        
        StringBuilder ans=new StringBuilder();
        for(String s:st){
            ans.append("/");
            ans.append(s);
        }
        if(ans.length()==0){
            return "/";
        }
        return ans.toString();

       
    }
}