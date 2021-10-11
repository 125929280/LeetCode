class Solution {
    public int minimumMoves(String s) {
        int ans = 0, cur = 0;
        for(int i = 0;i < s.length();i ++) {
            if(cur > 0) {
                cur ++;
                if(cur == 3) {
                    ans ++;
                    cur = 0;
                }
                continue;
            }
            if(s.charAt(i) == 'X') cur ++;
        }
        return cur == 0 ? ans : ans+1;
    }
}