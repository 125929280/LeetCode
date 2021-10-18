class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int sum = 0;
        for(int i = 0;i < m;i ++) {
            for(int j = 0;j < n;j ++) {
                if(grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                } else if(grid[i][j] == 1) sum ++;
            }
        }
        if(sum == 0) return 0;
        int ans = 0;
        while(!q.isEmpty() && sum != 0) {
            int size = q.size();
            System.out.println(size);
            while(size -- != 0) {
                int x = q.peek()[0], y = q.peek()[1];
                q.poll();
                for(int i = 0;i < 4;i ++) {
                    int newx = x + dx[i], newy = y + dy[i];
                    if(newx >= 0 && newx < m && newy >= 0 && newy < n && grid[newx][newy] == 1) {
                        sum --;
                        grid[newx][newy] = 2;
                        q.offer(new int[]{newx, newy});
                    }
                }
            }
            ans ++;
        }
        return sum == 0 ? ans : -1;
    }
}