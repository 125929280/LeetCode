/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func splitListToParts(head *ListNode, k int) []*ListNode {
	len := 0
	for cur := head; cur != nil; cur = cur.Next {
		len++
	}
	size, remain := len/k, len%k
	ans := make([]*ListNode, 0)
	for i := 0; i < k; i++ {
		root := &ListNode{}
		cur_size, cur_node := size, root
		if i < remain {
			cur_size++
		}
		for j := 0; j < cur_size; j++ {
			tmp := &ListNode{Val: head.Val}
			cur_node.Next = tmp
			cur_node = cur_node.Next
			head = head.Next
		}
		cur_node.Next = nil
		ans = append(ans, root.Next)
	}
	return ans
}