/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func sortedArrayToBST(nums []int) *TreeNode {
	return dfs(nums, 0, len(nums)-1)
}

func dfs(nums []int, l, r int) *TreeNode {
	if l > r {
		return nil
	}
	m := (l + r) / 2
	cur := &TreeNode{Val: nums[m]}
	cur.Left = dfs(nums, l, m-1)
	cur.Right = dfs(nums, m+1, r)

	return cur
}