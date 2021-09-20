class Solution {
    public int findNumberOfLIS(int[] nums) {
        int len = nums.length, max_l = 0, ans = 0;
        int[] dp = new int[len], cnt = new int[len];

        for(int i = 0;i < len;i ++) {
            dp[i] = cnt[i] = 1;
            for(int j = 0;j < i;j ++) {
                if(nums[i] > nums[j]) {
                        if(dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        cnt[i] = cnt[j];
                    }else if(dp[j] + 1 == dp[i]) {
                        cnt[i] += cnt[j];
                    }
                }
            }
            max_l = Math.max(max_l, dp[i]);
        }

        for(int i = 0;i < len;i ++) {
            if(dp[i] == max_l) ans += cnt[i];
        }
        return ans;
    }
}