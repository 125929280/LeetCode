class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> letterCasePermutation(String s) {
        dfs(s.toCharArray(), 0);
        return ans;
    }

    public void dfs(char[] str, int i) {
        if(i == str.length) {
            ans.add(new String(str));
            return ;
        }
        if(str[i] >= '0' && str[i] <= '9') dfs(str, i + 1);
        else {
            str[i] = Character.toUpperCase(str[i]);
            dfs(str, i + 1);
            str[i] = Character.toLowerCase(str[i]);
            dfs(str, i + 1);
        }
    }
}