/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func swapPairs(head *ListNode) *ListNode {
	if head == nil || head.Next == nil {
		return head
	}
	//递归
	// one := head
	// two := head.Next
	// one.Next = swapPairs(two.Next)
	// two.Next = one

	// return two

	//迭代
	dummy := &ListNode{Next: head}
	zero := dummy
	one := head

	for one != nil && one.Next != nil {
		two := one.Next
		one.Next = two.Next
		two.Next = one
		zero.Next = two

		//update
		zero = one
		one = one.Next
	}
	return dummy.Next
}