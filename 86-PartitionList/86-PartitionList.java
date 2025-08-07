// Last updated: 8/7/2025, 10:04:00 PM
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
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        ListNode small = new ListNode(-1);
        ListNode temps = small;
        ListNode large = new ListNode(-1);
        ListNode templ = large;
        while(temp != null){
            ListNode a = new ListNode(temp.val);
            if(temp.val >= x){
                
                templ.next = a;
                templ = a;
                temp = temp.next;
            }
            else{
               // ListNode a = new ListNode(temp.val);
                temps.next = a;
                temps = a;
                temp = temp.next;
            }
        }
        temps.next = large.next;
        return small.next;
    }
}