class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> st=new ArrayDeque<>();
        int n=temperatures.length;
        int[] res=new int[n];
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int prevIndex=st.pop();
                res[prevIndex]=i-prevIndex;
            }
            st.push(i);
        }
        return res;
    }
}

// 73,74,75,71,69,72,76,73
// st=2  6 7
// ans[0]=1-0=1
// ans[1]=2-1-1
// ans[4]= 5-4=1
// ans[3]=5-3=2
// ans[5]=6-5=1
// ans[2]=6-2=4
// ans[7]= 0
// ans[6=0]