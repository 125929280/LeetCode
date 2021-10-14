class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // bfs
        // if(newColor == image[sr][sc]) return image;
        // int curColor = image[sr][sc], m = image.length, n = image[0].length;
        // Queue<int[]> queue = new LinkedList<>();
        // queue.offer(new int[]{sr, sc});
        // while(!queue.isEmpty()) {
        //     int x = queue.peek()[0], y = queue.peek()[1];
        //     queue.poll();
        //     image[x][y] = newColor;
        //     for(int i = 0;i < 4;i ++) {
        //         int newx = x + dx[i], newy = y + dy[i];
        //         if(newx >= 0 && newx < m && newy >= 0 && newy < n && image[newx][newy] == curColor) {
        //             queue.offer(new int[]{newx, newy});
        //         }
        //     }
        // }
        // return image;

        // dfs
        if(newColor == image[sr][sc]) return image;
        dfs(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    public void dfs(int [][] image, int x, int y, int curColor, int newColor) {
        if(image[x][y] == curColor) {
            image[x][y] = newColor;
            for(int i = 0;i < 4;i ++) {
                int newx = x + dx[i], newy = y + dy[i];
                if(newx >= 0 && newx < image.length && newy >= 0 && newy < image[0].length) {
                    dfs(image, newx, newy, curColor, newColor);
                }
            }
        }
    }
}