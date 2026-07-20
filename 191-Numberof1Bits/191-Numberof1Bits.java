// Last updated: 7/21/2026, 12:34:40 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeElements(ListNode head, int val) {
13        if(head == null) return head;
14
15        ListNode dummy = new ListNode(0);
16        dummy.next = head;
17        ListNode curr = dummy;
18        
19        while(curr.next != null){
20            if(curr.next.val == val){
21                curr.next = curr.next.next;
22            }
23            else{
24                curr = curr.next;
25            }
26        }  
27        return dummy.next; 
28    }
29}