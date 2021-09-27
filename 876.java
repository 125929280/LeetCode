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
    public ListNode middleNode(ListNode head) {
        // int len = 0;
        // ListNode cur = head;
        // while(cur != null) {
        //     len ++;
        //     cur = cur.next;
        // }
        // len = (len+2)/2;
        // cur = head;
        // while(--len > 0) {
        //     cur = cur.next;
        // }

        // return cur;

        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}