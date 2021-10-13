/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        List<Integer> l = new ArrayList<>();
        helper(l, head);
        int[] ans = new int[l.size()];
        for(int i = 0;i < l.size();i ++) ans[i] = l.get(i);
        return ans;
    }

    public void helper(List<Integer> l, ListNode head) {
        if(head == null) return ;
        helper(l, head.next);
        l.add(head.val);
    }
}