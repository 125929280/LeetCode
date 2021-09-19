class Solution {
    public int maxProfit(int[] prices) {
        int min_price = prices[0], max_profit = 0;
        for(int p:prices) {
            max_profit = Math.max(max_profit, p - min_price);
            min_price = Math.min(min_price, p);
        }
        return max_profit;
    }
}