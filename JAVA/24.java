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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;

        //递归
        // ListNode one = head, two = head.next;
        // one.next = swapPairs(two.next);
        // two.next = one;
        // return two;

        //迭代
        ListNode dummy = new ListNode(0, head);
        ListNode zero = dummy, one = head;

        while(one != null && one.next != null) {
            ListNode two = one.next;
            one.next = two.next;
            two.next = one;
            zero.next = two;

            zero = one;
            one = one.next;
        }

        return dummy.next;
    }
}