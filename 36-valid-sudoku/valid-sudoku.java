class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    int boxIndex=(i / 3) * 3 + (j / 3);
                    String rowKey = board[i][j] + " found in row " + i;
                    String colKey = board[i][j] + " found in col " + j;
                    String BoxKey = board[i][j] + " found in box " + boxIndex;
                    if(!seen.add(rowKey)||!seen.add(colKey)||!seen.add(BoxKey)){
                        return false;
                    }
                }
            }

        }
        return true;
    }
}