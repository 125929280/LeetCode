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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0;
        for(ListNode tmp = head; tmp != null; tmp = tmp.next, len ++);
        if(len == 0) return new ListNode[k];
        int size = len/k, remain = len%k;
        System.out.println(len);
        ListNode[] ans = new ListNode[k];
        ListNode cur = null;
        for(int i = 0;i < k;i ++) {
            int cur_size = size;
            ans[i] = head;
            if(i < remain) cur_size ++;
            for(int j = 0;j < cur_size;j ++) {
                cur = head;
                head = head.next;
            }
            cur.next = null;
        }
        return ans;
    }
}