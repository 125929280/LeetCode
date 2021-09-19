class Solution {
    public int climbStairs(int n) {
        if(n <= 2) return n;
        int []ans = new int[50];
        ans[1] = 1;
        ans[2] = 2;
        for(int i = 3;i <= 45;i ++) {
            ans[i] = ans[i-1] + ans[i-2];
        }
        return ans[n];
    }
}