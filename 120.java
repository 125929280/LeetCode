class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        // 二维dp
        // int l = triangle.size();
        // int[][] dp = new int[l][l];
        // dp[0][0] = triangle.get(0).get(0);
        // for(int i = 1;i < l;i ++) {
        //     for(int j = 0;j <= i;j ++) {
        //         int cur = triangle.get(i).get(j);
        //         if(j == 0) dp[i][j] = dp[i-1][j] + cur;
        //         else if(i == j) dp[i][j] = dp[i-1][j-1] + cur;
        //         else dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j-1]) + cur;
        //     }
        // }
        // int ans = dp[l-1][0];
        // for(int i : dp[l-1]) ans = Math.min(ans, i);
        // return ans;

        // 一维dp
        int l = triangle.size();
        int[] dp = new int[l];
        for(int i = 0;i < l;i ++) dp[i] = triangle.get(l-1).get(i);
        for(int i = l-2;i >= 0;i --) {
            for(int j = 0;j <= i;j ++) {
                dp[j] = Math.min(dp[j], dp[j+1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
}