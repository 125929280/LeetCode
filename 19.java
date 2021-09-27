/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // two-pointers
        // ListNode dummy = new ListNode(0, head);
        // ListNode slow = dummy, fast = head;
        // while(n-- > 0) fast = fast.next;
        // while(fast != null) {
        //     fast = fast.next;
        //     slow = slow.next;
        // }
        // slow.next = slow.next.next;
        // return dummy.next;

        //栈
        ListNode dummy = new ListNode(0, head);
        Deque<ListNode> stack = new LinkedList<>();
        ListNode cur = dummy;
        while(cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        while(n-- > 0) {
            stack.pop();
        }
        ListNode prev = stack.peek();
        prev.next = prev.next.next;
        return dummy.next;
    }
}