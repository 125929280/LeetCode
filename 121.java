class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int cur = prices[0], ans = 0;
        for(int i = 1;i < prices.length;i ++) {
            ans = Math.max(ans, prices[i] - cur);
            cur = Math.min(cur, prices[i]);
        }
        return ans;
    }
}