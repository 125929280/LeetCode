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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        
        //快慢指针
        // ListNode slow = head, fast = head.next;
        // while(fast != null) {
        //     if(slow.val != fast.val) {
        //         slow.next = fast;
        //         slow = slow.next;
        //     }
        //     fast = fast.next;
        // }
        // slow.next = null;
        // return head;

        // ListNode cur = head;
        // while(cur.next != null) {
        //     if(cur.val == cur.next.val) {
        //         cur.next = cur.next.next;
        //     }else cur = cur.next;
        // }
        // return head;

        //递归
        if(head.val != head.next.val) {
            head.next = deleteDuplicates(head.next);
        }else {
            ListNode cur = head.next;
            while(cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
            }
            return deleteDuplicates(cur);
        }
        return head;
    }
}