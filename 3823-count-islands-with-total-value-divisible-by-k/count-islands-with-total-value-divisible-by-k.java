class Solution {
    public int countIslands(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        System.out.println(n);
        boolean[][] visited=new boolean[n][m];
        int ans=0;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0 && !visited[i][j]){
                    long p=dfs(i,j,m,n,visited,grid);
                     if(p%k==0){
                         ans++;
                     }
                }
                
            }
           
            
        }
        return ans;
    }
    long dfs(int i,int j,int m,int n,boolean[][] visited,int[][] grid){
        if(i<0 || j<0 || i>=n || j>=m || visited[i][j] || grid[i][j]==0){
            return 0;
        }
        visited[i][j]=true;
        long down=dfs(i,j+1,m,n,visited,grid);
        long right=dfs(i+1,j,m,n,visited,grid);
        long left=dfs(i-1,j,m,n,visited,grid);
        long up=dfs(i,j-1,m,n,visited,grid);
        return left+right+up+down+grid[i][j];
        

        

    }
}