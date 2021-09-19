class Solution {
    public int minSteps(int n) {
        //分解质因数
        // int ans = 0;
        // for(int i = 2;i <= n;i ++) {
        //     while(n % i == 0) {
        //         ans += i;//能进到这一步的i只可能为质数，而质数需要的操作次数为它本身
        //         n /= i;
        //     }
        // }
        // return ans;

        //dp
        //List<Integer> f = new ArrayList<Integer>();
        int []f = new int[n+1];
        for(int i = 2;i <= n;i ++) {
            f[i] = Integer.MAX_VALUE;
            for(int j = 1;j <= i;j ++) {
                if(i % j == 0) {
                    f[i] = Math.min(f[i], f[j] + i/j);
                }
            }
        }
        return f[n];
    }
}