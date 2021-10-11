class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length, n = grid[0].length, cur = 0;
        int[] tmp = new int[m*n];
        for(int i = 0;i < m;i ++) {
            for(int j = 0;j < n;j ++) {
                tmp[cur ++] = grid[i][j];
            }
        }
        Arrays.sort(tmp);
        if(m*n % 2 == 0) {
            int ans1 = helper(tmp, tmp[m*n/2-1], x), ans2 = helper(tmp, tmp[m*n/2], x);
            if(ans1 == -1 && ans2 == -1) return -1;
            else if(ans1 == -1) return ans2;
            else if(ans2 == -1) return ans1;
            else return Math.min(ans1, ans2);
        } else return helper(tmp, tmp[m*n/2], x);
    }

    public int helper(int[] tmp, int target, int x) {
        int ans = 0;
        for(int i = 0;i < tmp.length;i ++) {
            int t = Math.abs(tmp[i] - target);
            if(t % x == 0) ans += t/x;
            else return -1;
        }
        return ans;
    }
}