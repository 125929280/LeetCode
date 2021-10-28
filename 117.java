/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null) return root;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int len = q.size();
            while(len-- != 0) {
                Node node = q.poll();
                if(len != 0) node.next = q.peek();
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
        }
        return root;
    }
}