class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] dist = new int[m][n];
        Queue<int[]> q = new LinkedList<>();
        // boolean[][] visit = new boolean[m][n];
        // for(int i = 0;i < m;i ++) {
        //     for(int j = 0;j < n;j ++) {
        //         if(mat[i][j] == 0) {
        //             q.offer(new int[]{i, j});
        //             visit[i][j] = true;
        //         }
        //     }
        // }
        // while(!q.isEmpty()) {
        //     int x = q.peek()[0], y = q.peek()[1];
        //     q.poll();
        //     for(int i = 0;i < 4;i ++) {
        //         int newx = x + dx[i], newy = y + dy[i];
        //         if(newx >= 0 && newx < m && newy >= 0 && newy < n && !visit[newx][newy]) {
        //             q.offer(new int[]{newx, newy});
        //             dist[newx][newy] = dist[x][y] + 1;
        //             visit[newx][newy] = true;
        //         }
        //     }
        // }
        for(int i = 0;i < m;i ++) {
            for(int j = 0;j < n;j ++) {
                if(mat[i][j] == 0) {
                    for(int k = 0;k < 4;k ++) {
                        int x = i + dx[k], y = j + dy[k];
                        if(x >= 0 && x < m && y >= 0 && y < n && mat[x][y] == 1 && dist[x][y] == 0) {
                            q.offer(new int[]{x, y});
                            dist[x][y] = 1;
                        }
                    }
                }
            }
        }
        while(!q.isEmpty()) {
            int x = q.peek()[0], y = q.peek()[1];
            q.poll();
            for(int i = 0;i < 4;i ++) {
                int newx = x + dx[i], newy = y + dy[i];
                if(newx >= 0 && newx < m && newy >= 0 && newy < n && mat[newx][newy] == 1 && dist[newx][newy] == 0) {
                    q.offer(new int[]{newx, newy});
                    dist[newx][newy] = dist[x][y] + 1;
                }
            }
        }
        return dist;
    }
}