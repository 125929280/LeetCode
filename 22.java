class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        // StringBuilder cur = new StringBuilder();
        // helper(ans, cur, 0, 0, n);
        helper(ans, "", 0, 0, n);
        return ans;
    }

    // public void helper(List<String> ans, StringBuilder cur, int left, int right, int n) {
    //     if(cur.length() == n*2) ans.add(cur.toString());
    //     if(left < n) {
    //         cur.append("(");
    //         helper(ans, cur, left+1, right, n);
    //         cur.deleteCharAt(cur.length()-1);
    //     }
    //     if(left > right) {
    //         cur.append(")");
    //         helper(ans, cur, left, right+1, n);
    //         cur.deleteCharAt(cur.length()-1);
    //     }
    // }

    public void helper(List<String> ans, String cur, int left, int right, int n) {
        if(left == n && right == n) ans.add(cur);
        if(left < n) helper(ans, cur + "(", left+1, right, n);
        if(left > right) helper(ans, cur + ")", left, right+1, n);
    }
}