class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] directions={
            {-1,0},{1,0},{0,1},{0,-1}
        };
        int row=image.length;
        int col=image[0].length;
        boolean[][] visited=new boolean[row][col];
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{sr,sc});
        int originalColor=image[sr][sc];
        visited[sr][sc]=true;
        while(!q.isEmpty()){
            
            int[] p=q.poll();
            int r=p[0];
            int c=p[1];
            image[r][c]=color;
            for(int[] direction:directions){
                int nr=r+direction[0];
                int nc=c+direction[1];
                if((nr>=0 && nr<row)&& (nc>=0 && nc<col) && image[nr][nc]==originalColor  && visited[nr][nc]==false){
                    q.offer(new int[]{nr,nc});
                    visited[nr][nc]=true;
                }
            }
        }
        return image;
    }
}