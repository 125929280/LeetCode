/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func leafSimilar(root1 *TreeNode, root2 *TreeNode) bool {
	l1 := make([]int, 0)
	l2 := make([]int, 0)
	dfs(&l1, root1)
	dfs(&l2, root2)

	if len(l1) != len(l2) {
		return false
	}
	for i := 0; i < len(l1); i++ {
		if l1[i] != l2[i] {
			return false
		}
	}
	return true
}

func dfs(l *[]int, root *TreeNode) {
	if root == nil {
		return
	}
	if root.Left == nil && root.Right == nil {
		*l = append(*l, root.Val)
		return
	}
	dfs(l, root.Left)
	dfs(l, root.Right)
}