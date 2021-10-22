class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len <= 1) return s;
        boolean[][] dp = new boolean[len][len];
        for(int i = 0;i < len;i ++) dp[i][i] = true;
        char[] c = s.toCharArray();
        int begin = 0, max_l = 1;
        for(int l = len-2;l >= 0;l --) {
            for(int r = l+1;r < len;r ++) {
                if(c[l] != c[r]) dp[l][r] = false;
                else {
                    if(r - l <= 2) dp[l][r] = true;
                    else dp[l][r] = dp[l+1][r-1];
                }
                if(r-l+1 > max_l && dp[l][r]) {
                    max_l = r-l+1;
                    begin = l;
                }
            }
        }
        return s.substring(begin, begin+max_l);
    }
}