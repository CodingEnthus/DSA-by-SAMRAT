class Solution {
    public int distance(int x,int y){
    int d= (x*x + y*y);
        return d;
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->distance(b[0],b[1])-distance(a[0],a[1]));
        for(int[] point:points){
            pq.offer(point);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[][] ans=new int[k][2];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll();
        }
        return ans;


    }
}