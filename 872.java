/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();

        dfs(l1, root1);
        dfs(l2, root2);

        return l1.equals(l2);
    }

    public void dfs(List<Integer> l, TreeNode root) {
        if(root == null) return ;
        if(root.left == null && root.right == null) {
            l.add(root.val);
        }
        dfs(l, root.left);
        dfs(l, root.right);
    }
}