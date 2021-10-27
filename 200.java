class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        int ans = 0;
        int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0;i < m;i ++) {
            for(int j = 0;j < n;j ++) {
                if(grid[i][j] == '1') {
                    grid[i][j] = '0';
                    q.offer(new int[]{i, j});
                    while(!q.isEmpty()) {
                        int x = q.peek()[0], y = q.peek()[1];
                        q.poll();
                        for(int k = 0;k < 4;k ++) {
                            int newx = x + dx[k], newy = y + dy[k];
                            if(newx >= 0 && newx < m && newy >= 0 && newy < n && grid[newx][newy] == '1') {
                                grid[newx][newy] = 0;
                                q.offer(new int[]{newx, newy});
                            }
                        }
                    }
                    ans ++;
                }
                // ans ++;
            }
        }
        return ans;
    }
}