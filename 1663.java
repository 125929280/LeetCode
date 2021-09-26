class Solution {
    public String getSmallestString(int n, int k) {
        char[] ans = new char[n];
        k -= n;
        for(int i = n-1 ;i >= 0; i --) {
            int t = 0;
            while(k > 0 && t < 25) {
                k --;
                t ++;
            }
            ans[i] = (char)('a' + t);
        }
        return new String(ans);
    }
}