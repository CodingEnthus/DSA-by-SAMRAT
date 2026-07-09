class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        int n=temperatures.length;
        int[] ans=new int[n];
        Arrays.fill(ans,0);
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int j=st.pop();
                ans[j]=i-j;
            }
            st.push(i);
        }
        return ans;
    }
}