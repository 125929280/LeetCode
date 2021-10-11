class Solution {
    public int arrangeCoins(int n) {
        // 模拟
        // int ans = 0, cur = 1;
        // while(n >= cur) {
        //     n -= cur;
        //     cur ++;
        //     ans ++;
        // }
        // return ans;

        // 数学
        // return (int)((Math.sqrt(1.0+8.0*n)-1.0)/2.0);

        //二分
        if(n == 1) return 1;
        long l = 1, r = n;
        while(l < r) {
            long m = (l+r)/2;
            long cur = (long)m*(m+1)/2;
            if(cur < (long)n) {
                l = m+1;
            } else if(cur == (long)n) {
                return (int)m;
            } else if(cur > n) {
                r = m;
            }
        }
        return (int)l-1;
    }
}