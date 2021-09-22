class Solution {
    public String[] permutation(String S) {
        StringBuffer s = new StringBuffer();
        List<String> ans = new ArrayList<String>();
        dfs(ans, S, s);
        return ans.toArray(new String[ans.size()]);
    }

    void dfs(List<String> l, String S, StringBuffer s) {
        if(S.length() == s.length()) {
            l.add(new String(s));
            return ;
        }
        for(int i = 0;i < S.length(); i ++) {
            String tmp = new String(s);
            if(tmp.contains(S.charAt(i) + "")) continue ;
            s.append(S.charAt(i));
            dfs(l, S, s);
            s.deleteCharAt(s.length() - 1);
        }
    }
}