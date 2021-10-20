class Solution {
    public boolean isPowerOfTwo(int n) {
        // 循环
        // if(n <= 0) return false;
        // while(n != 1) {
        //     if(n % 2 == 1) return false;
        //     n = n >> 1;
        // }
        // return n == 1;

        // return n > 0 && (n&(n-1)) == 0;
        return n > 0 && (n&(-n)) == n;
    }
}