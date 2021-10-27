/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int ans, k;
    public int kthLargest(TreeNode root, int _k) {
        k = _k;
        dfs(root);
        return ans;
    }
    public void dfs(TreeNode root) {
        if(root == null) return ;
        dfs(root.right);
        if(--k == 0) ans = root.val;
        dfs(root.left);
    }
}