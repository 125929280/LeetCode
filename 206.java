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
    public ListNode reverseList(ListNode head) {
        // ListNode pre = null, cur = head;
        // while(cur != null) {
        //     ListNode next = cur.next;
        //     cur.next = pre;
        //     pre = cur;
        //     cur = next;
        // }
        // return pre;

        // if(head == null || head.next == null) return head;
        // ListNode cur = reverseList(head.next);
        // head.next.next = head;
        // head.next = null;
        // return cur;
        
        if(head == null || head.next == null) return head;
        ListNode cur = head;
        while(head.next != null) {
            ListNode next = head.next.next;
            head.next.next = cur;
            cur = head.next;
            head.next = next;
        }
        return cur;
    }
}