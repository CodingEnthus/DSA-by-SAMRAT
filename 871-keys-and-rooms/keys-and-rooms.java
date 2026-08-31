class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int u=0;u<rooms.size();u++){
            for(int v: rooms.get(u)) graph.get(u).add(v);
        }
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[n];
        boolean[] keys=new boolean[n];
        keys[0]=true;
        q.offer(0);
        while(!q.isEmpty()){
            int p=q.poll();
            visited[p]=true;
            if(!keys[p]) return false;
            for(int adj: graph.get(p)){
                if(!visited[adj]|| !keys[adj]){
                    keys[adj]=true;
                    q.offer(adj);
                }
            }

        }
        for(boolean ans: visited){
            if(!ans) return false;
        }
        return true;

    }
}