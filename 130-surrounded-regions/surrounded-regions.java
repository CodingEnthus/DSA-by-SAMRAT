class Solution {
    public boolean valid(int i,int j,int n,int m){
        if(i<0 || i>=n || j<0 || j>=m) return false;
        return true;
    }
    int[] dr={-1,1,0,0};
    int[] dc={0,0,-1,1};
    public void dfs(char[][] board,int i,int j,int m,int n){
        board[i][j]='#';
        for(int k=0;k<4;k++){
            int r=i+dr[k];
            int c=j+dc[k];
            if(valid(r,c,n,m)&& board[r][c]=='O'){
                dfs(board,r,c,m,n);
            }

        }

    }
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        for(int j=0;j<m;j++){
            if(board[0][j]=='O'){
                dfs(board,0,j,m,n);
            }
        }
        for(int j=0;j<m;j++){
            if(board[n-1][j]=='O'){
                dfs(board,n-1,j,m,n);
            }
        }
        for(int i=0;i<n;i++){
            if(board[i][0]=='O'){
                dfs(board,i,0,m,n);
            }
        }
        for(int i=0;i<n;i++){
            if(board[i][m-1]=='O'){
                dfs(board,i,m-1,m,n);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='#'){
                    board[i][j]='O';
                }else{
                    board[i][j]='X';
                }
            }
        }
    }
}