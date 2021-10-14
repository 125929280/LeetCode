class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    public int maxAreaOfIsland(int[][] grid) {
        // bfs
        // int m = grid.length, n = grid[0].length, ans = 0;
        // for(int i = 0;i < m;i ++) {
        //     for(int j = 0;j < n;j ++) {
        //         if(grid[i][j] == 1) {
        //             Queue<int []> queue = new LinkedList<>();
        //             queue.offer(new int[]{i, j});  
        //             grid[i][j] = 0;
        //             int cur = 0;                  
        //             while(!queue.isEmpty()) {
        //                 int x = queue.peek()[0], y = queue.peek()[1];
        //                 queue.poll();
        //                 cur ++;
        //                 for(int k = 0;k < 4;k ++) {
        //                     int newx = x + dx[k], newy = y + dy[k];
        //                     if(newx >= 0 && newx < m && newy >= 0 && newy < n && grid[newx][newy] == 1) {
        //                         queue.offer(new int[]{newx, newy});
        //                         grid[newx][newy] = 0;
        //                     }
        //                 }
        //             }
        //             ans = Math.max(ans, cur);
        //         }
        //     }
        // }
        // return ans;

        // dfs
        int m = grid.length, n = grid[0].length, ans = 0;
        for(int i = 0;i < m;i ++) {
            for(int j = 0;j < n;j ++) {
                if(grid[i][j] == 1) {
                    ans = Math.max(ans, dfs(grid, i, j));
                }
            }
        }
        return ans;
    }

    public int dfs(int[][] grid, int x, int y) {
        if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] != 1) return 0;
        grid[x][y] = 0;
        int ans = 1;
        for(int i = 0;i < 4;i ++) {
            int newx = x + dx[i], newy = y + dy[i];
            ans += dfs(grid, newx, newy);
        }
        return ans;
    }
}