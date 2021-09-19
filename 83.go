/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func deleteDuplicates(head *ListNode) *ListNode {
	if head == nil || head.Next == nil {
		return head
	}

	//快慢指针
	// slow := head
	// fast := head.Next
	// for fast != nil {
	//     if(slow.Val != fast.Val) {
	//         slow.Next = fast
	//         slow = slow.Next
	//     }
	//     fast = fast.Next
	// }
	// slow.Next = nil
	// return head

	// cur := head
	// for cur.Next != nil {
	//     if cur.Val == cur.Next.Val {
	//         cur.Next = cur.Next.Next
	//     }else {
	//         cur = cur.Next;
	//     }
	// }
	// return head

	//递归
	if head.Val != head.Next.Val {
		head.Next = deleteDuplicates(head.Next)
	} else {
		cur := head.Next
		for cur.Next != nil && cur.Val == cur.Next.Val {
			cur = cur.Next
		}
		return deleteDuplicates(cur)
	}
	return head
}