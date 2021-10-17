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
        // 递归
        // List<Integer> ans = new ArrayList<>();
        // inOrder(ans, root);
        // return ans;

        // 迭代
        // List<Integer> ans = new ArrayList<>();
        // Deque<TreeNode> stack = new LinkedList<>();
        // while(root != null || !stack.isEmpty()) {
        //     while(root != null) {
        //         stack.push(root);
        //         root = root.left;
        //     }
        //     root = stack.pop();
        //     ans.add(root.val);
        //     root = root.right;
        // }
        // return ans;

        //Morris
        List<Integer> ans = new ArrayList<>();
        TreeNode pre = null;
        while(root != null) {
            if(root.left == null) {
                ans.add(root.val);
                root = root.right;
            } else {
                pre = root.left;
                while(pre.right != null && pre.right != root) pre = pre.right;
                if(pre.right == null) {
                    pre.right = root;
                    root = root.left;
                } else if(pre.right == root) {
                    ans.add(root.val);
                    pre.right = null;
                    root = root.right;
                }
            }
        }
        return ans;
    }

    // public void inOrder(List<Integer> ans, TreeNode root) {
    //     if(root == null) return ;
    //     inOrder(ans, root.left);
    //     ans.add(root.val);
    //     inOrder(ans, root.right);
    // }
}