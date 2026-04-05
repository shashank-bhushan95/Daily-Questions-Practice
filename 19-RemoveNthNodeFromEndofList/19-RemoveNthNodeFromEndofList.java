// Last updated: 4/5/2026, 7:44:06 PM
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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15        int size = 0;
16        ListNode temp = head;
17
18        while(temp != null){
19            size++;
20            temp = temp.next;
21        }
22
23        int position = size - n;
24        ListNode curr = dummy;
25        for(int i = 0; i < position; i++){
26            curr = curr.next;
27        }
28        
29        curr.next = curr.next.next;
30
31        return dummy.next;
32    }
33}