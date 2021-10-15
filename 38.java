class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String ans = "1";
        for(int i = 1;i < n;i ++) {
            String cur = "";
            int l = 0, r = 0;
            while(r < ans.length()) {
                while(r < ans.length() && ans.charAt(l) == ans.charAt(r)) {
                    r ++;
                }
                cur += r - l + "" + ans.charAt(l);
                l = r;
            }
            ans = cur;
        }
        return ans;
    }
}