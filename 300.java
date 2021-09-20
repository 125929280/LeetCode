class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length, ans = 0;
        int[] dp = new int[len];

        for(int i = 0;i < len;i ++) {
            dp[i] = 1;
            for(int j = 0;j < i;j ++) {
                if(nums[i] > nums[j]) dp[i] = Math.max(dp[i], dp[j]+1);
            }
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}