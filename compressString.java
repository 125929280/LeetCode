class Solution {
    public String compressString(String S) {
        if(S.length() == 0) return S;
        StringBuffer ans = new StringBuffer();
        char cur = S.charAt(0);
        int cur_cnt = 1, len = S.length();
        
        for(int i = 1;i < len;i ++) {
            if(S.charAt(i) != cur) {
                ans.append(cur);
                ans.append(cur_cnt);
                cur = S.charAt(i);
                cur_cnt = 1;
            }else {
                cur_cnt ++;
            }
        }
        ans.append(cur);
        ans.append(cur_cnt);
        if(ans.length() >= len) return S;
        return ans.toString();
    }
}