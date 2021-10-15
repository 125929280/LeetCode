/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int kthToLast(ListNode head, int k) {
        ListNode cur = head;
        while(k-- != 0) cur = cur.next;
        while(cur != null) {
            cur = cur.next;
            head = head.next;
        }
        return head.val;
    }
}