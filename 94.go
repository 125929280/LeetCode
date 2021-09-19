/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func inorderTraversal(root *TreeNode) []int {
	//递归
	// res := []int{}
	// inorder(root, &res)
	// return res

	//迭代
	stack := []*TreeNode{}
	res := []int{}
	for root != nil || len(stack) > 0 {
		for root != nil {
			stack = append(stack, root)
			root = root.Left
		}
		root = stack[len(stack)-1]
		res = append(res, root.Val)
		stack = stack[:len(stack)-1]
		root = root.Right
	}
	return res
}

// func inorder(node *TreeNode, res *[]int) {
//     if node == nil {
//         return
//     }
//     inorder(node.Left, res)
//     *res = append(*res, node.Val)
//     inorder(node.Right, res)
// }