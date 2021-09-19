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
    public List<Integer> inorderTraversal(TreeNode root) {
        //递归
        // List<Integer> ans = new ArrayList<Integer>();
        // inorder(root, ans);
        // return ans;

        //迭代
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> ans = new ArrayList<Integer>();

        while(root != null || stack.size() > 0) {
            while(root != null) {
                stack.add(root);
                root = root.left;
            }
            root = stack.peek();
            stack.pop();
            ans.add(root.val);

            root = root.right;
        }
        return ans;
    }

    // public void inorder(TreeNode root, List<Integer> ans) {
    //     if(root == null) return ;
    //     inorder(root.left, ans);
    //     ans.add(root.val);
    //     inorder(root.right, ans);
    // }
}