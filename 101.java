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
    public boolean isSymmetric(TreeNode root) {
        return root == null || helper(root.left, root.right);
    }
    public boolean helper(TreeNode l, TreeNode r) {
        if(l == null && r == null) return true;
        if(l == null || r == null) return false;
        return l.val == r.val && helper(l.left, r.right) && helper(l.right, r.left);
    }
}