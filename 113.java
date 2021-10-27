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
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> cur = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        dfs(root, target);
        return ans;
    }

    public void dfs(TreeNode root, int target) {
        if(root == null) return ;
        cur.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null) ans.add(new ArrayList<>(cur));
        dfs(root.left, target);
        dfs(root.right, target);
        cur.remove(cur.size()-1);
    }
}