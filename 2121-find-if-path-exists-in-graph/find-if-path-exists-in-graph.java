class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean[] visited=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.offer(source);
        visited[source]=true;
        while(!q.isEmpty()){
            if(visited[destination]) return true;
            int p=q.poll();
            for(int adj:graph.get(p)){
                if(!visited[adj]){
                    q.offer(adj);
                    visited[adj]=true;
                }
            }
        }
        return false;

    }
}