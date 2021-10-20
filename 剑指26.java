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
    public boolean isSubStructure(TreeNode a, TreeNode b) {
        if(a == null || b == null) return false;
        return helper(a, b) || isSubStructure(a.left, b) || isSubStructure(a.right, b);
    }

    public boolean helper(TreeNode a, TreeNode b) {
        if(b == null) return true;
        if(a == null) return false;
        return a.val == b.val && helper(a.left, b.left) && helper(a.right, b.right);
    }
}