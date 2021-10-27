class Solution {
    public int movingCount(int m, int n, int k) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        boolean[][] visit = new boolean[m][n];
        Queue<int[]> q = new LinkedList<>();
        int ans = 1;
        q.offer(new int[]{0, 0});
        visit[0][0] = true;
        while(!q.isEmpty()) {
            int x = q.peek()[0], y = q.peek()[1];
            q.poll();
            for(int i = 0;i < 4;i ++) {
                int newx = x + dx[i], newy = y + dy[i];
                if(newx >= 0 && newx < m && newy >= 0 && newy < n && cal(newx) + cal(newy) <= k && !visit[newx][newy]) {
                    visit[newx][newy] = true;
                    q.offer(new int[]{newx, newy});
                    ans ++;
                }
            }
        }
        return ans;
    }

    public int cal(int x) {
        int ans = 0;
        while(x != 0) {
            ans += x%10;
            x /= 10;
        }
        return ans;
    }
}