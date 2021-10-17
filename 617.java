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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        // dfs
        // if(root1 == null && root2 == null) return null;
        // if(root1 == null) return root2;
        // if(root2 == null) return root1;
        // root1.val += root2.val;
        // root1.left = mergeTrees(root1.left, root2.left);
        // root1.right = mergeTrees(root1.right, root2.right);
        // return root1;

        // bfs
        if(root1 == null) return root2;
        if(root2 == null) return root1;
        Queue<TreeNode> q = new LinkedList<>(), q1 = new LinkedList<>(), q2 = new LinkedList<>();
        TreeNode root = new TreeNode(root1.val + root2.val);
        q.offer(root);
        q1.offer(root1);
        q2.offer(root2);
        while(!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode t = q.poll(), t1 = q1.poll(), t2 = q2.poll();
            TreeNode l1 = t1.left, l2 = t2.left;
            TreeNode r1 = t1.right, r2 = t2.right;
            if(l1 != null || l2 != null) {
                if(l1 != null && l2 != null) {
                    t.left = new TreeNode(l1.val + l2.val);
                    q.offer(t.left);
                    q1.offer(l1);
                    q2.offer(l2);
                }
                else if(l1 == null) t.left = l2;
                else if(l2 == null) t.left = l1;
            }
            if(r1 != null || r2 != null) {
                if(r1 != null && r2 != null) {
                    t.right = new TreeNode(r1.val + r2.val);
                    q.offer(t.right);
                    q1.offer(r1);
                    q2.offer(r2);
                }
                else if(r1 == null) t.right = r2;
                else if(r2 == null) t.right = r1;
            }
        }
        return root;
    }
}