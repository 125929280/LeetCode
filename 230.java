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
    public int kthSmallest(TreeNode root, int k) {
        // 递归
        // List<Integer> ans = new ArrayList<>();
        // inOrder(ans, root);
        // return ans.get(k-1);

        // 迭代
        // Deque<TreeNode> stack = new LinkedList<>();
        // while(root != null || !stack.isEmpty()) {
        //     while(root != null) {
        //         stack.push(root);
        //         root = root.left;
        //     }
        //     root = stack.pop();
        //     if(--k == 0) break;
        //     root = root.right;
        // }
        // return root.val;

        // Hash
        Map<TreeNode, Integer> map = new HashMap<>();
        getNum(map, root);
        while(root != null) {
            int left = map.getOrDefault(root.left, 0);
            if(left == k-1) break;
            else if(left < k-1) {
                root = root.right;
                k -= left + 1;
            } else {
                root = root.left;
            }
        }
        return root.val;
    }

    // public void inOrder(List<Integer> ans, TreeNode root) {
    //     if(root == null) return ;
    //     inOrder(ans, root.left);
    //     ans.add(root.val);
    //     inOrder(ans, root.right);
    // }

    public int getNum(Map<TreeNode, Integer> map, TreeNode root) {
        if(root == null) return 0;
        map.put(root, getNum(map, root.left) + getNum(map, root.right) + 1);
        return map.getOrDefault(root, 0);
    }
}