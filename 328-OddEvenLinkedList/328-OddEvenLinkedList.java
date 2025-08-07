// Last updated: 8/7/2025, 10:03:37 PM
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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp = head;
        ListNode even = new ListNode(-1);
        ListNode tempe = even;
        ListNode odd = new ListNode(-10);
        ListNode tempo = odd;
        int idx = 1;
        while(temp != null){
            if(idx % 2 == 0){
                ListNode a = new ListNode(temp.val);
                tempe.next = a;
                tempe = a;
                temp = temp.next;
                idx++;
            }
            else{
                ListNode a = new ListNode(temp.val);
                tempo.next = a;
                tempo = a;
                temp = temp.next;
                idx++;
            }
        }
        tempo.next = even.next;
        return odd.next;
    }
}