import java.util.LinkedList;
import java.util.Queue;

// Custom class to store cell coordinates and the time layer
class pair {
    int row;
    int col;
    int time;

    pair(int row, int col, int time) {
        this.row = row;
        this.col = col;
        this.time = time;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        // Queue accepts exactly one object type: your custom 'pair' class
        Queue<pair> q = new LinkedList<>();
        int[][] visited = new int[n][m];
        
        int countFresh = 0;

        // 1. Initial scan: Find all rotten oranges and count fresh ones
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new pair(i, j, 0)); // Put initially rotten orange in queue at time 0
                    visited[i][j] = 2;          // Mark as visited
                } else {
                    visited[i][j] = 0;
                }
                
                if (grid[i][j] == 1) {
                    countFresh++; // Track fresh oranges to verify later
                }
            }
        }

        int maxTime = 0;
        int countRotten = 0;
        
        // Delta arrays for easy 4-directional neighbor movement (Up, Right, Down, Left)
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};

        // 2. Perform BFS traversal
        while (!q.isEmpty()) {
            pair current = q.poll();
            int r = current.row;
            int c = current.col;
            int t = current.time;
            
            maxTime = Math.max(maxTime, t); // Track the maximum time spent rotting

            // Check all 4 neighboring directions
            for (int i = 0; i < 4; i++) {
                int neighborRow = r + delRow[i];
                int neighborCol = c + delCol[i];

                // Ensure neighbor is within grid bounds, is fresh, and hasn't been visited yet
                if (neighborRow >= 0 && neighborRow < n && 
                    neighborCol >= 0 && neighborCol < m && 
                    visited[neighborRow][neighborCol] == 0 && 
                    grid[neighborRow][neighborCol] == 1) {
                    
                    // Rot this orange: Add to queue with incremented time layer
                    q.offer(new pair(neighborRow, neighborCol, t + 1));
                    visited[neighborRow][neighborCol] = 2; // Mark as visited/rotten
                    countRotten++;                         // Increment freshly rotten count
                }
            }
        }

        // 3. Final Check: If any fresh orange couldn't be reached, return -1
        if (countRotten != countFresh) {
            return -1;
        }

        return maxTime;
    }
}
