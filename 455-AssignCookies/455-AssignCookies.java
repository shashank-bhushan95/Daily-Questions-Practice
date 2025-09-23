// Last updated: 9/23/2025, 9:37:19 AM
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
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode nex = head.next;
        while(curr != null){
            nex = curr.next;
            curr.next =prev;
            prev = curr;
            curr = nex;
        }
        return prev;
    }
}