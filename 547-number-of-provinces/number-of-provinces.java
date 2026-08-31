class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj=new ArrayList<>();
        int n=isConnected.length;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                }
            }
        }
        int provinces=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                provinces++;
                dfs(i,adj,visited);
            }

        }
        return provinces;
    }
    void dfs(int node,List<List<Integer>> adj,boolean[] visited){
        visited[node]=true;
        for(int it:adj.get(node)){
            if(!visited[it]){
                dfs(it,adj,visited);
            }
        }
    }
}