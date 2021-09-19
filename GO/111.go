/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func minDepth(root *TreeNode) int {
	if root == nil {
		return 0
	}
	if root.Left == nil && root.Right == nil {
		return 1
	}

	_min := math.MaxInt32
	if root.Left != nil {
		_min = min(minDepth(root.Left), _min)
	}
	if root.Right != nil {
		_min = min(minDepth(root.Right), _min)
	}

	return _min + 1
}

func min(a, b int) int {
	if a > b {
		return b
	} else {
		return a
	}
}