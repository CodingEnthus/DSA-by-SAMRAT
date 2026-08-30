class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n=numCourses;
        if(n==0 || prerequisites.length==0) return true;
        int[] indeg=new int[n];
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge: prerequisites){
            int u=edge[0];
            int v=edge[1];
            graph.get(v).add(u);
        }
        return topologicalSort(n,graph);
    }
    public static boolean topologicalSort(int V,List<List<Integer>> adj){
        int[] indeg=new int[V];
        for(int i=0;i<V;i++){
            for(int it:adj.get(i)){
                indeg[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indeg[i]==0){
                q.offer(i);
            }
        }
        int count=0;
        int i=0;
        while(!q.isEmpty()){
            int p=q.poll();
            count++;
            for(int it: adj.get(p)){
                indeg[it]--;
                if(indeg[it]==0){
                    q.offer(it);
                }

            }
        }
    return count==V;
    }
}