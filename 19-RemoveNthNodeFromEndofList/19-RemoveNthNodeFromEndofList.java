// Last updated: 4/14/2026, 5:31:40 PM
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
13        int len = 0;
14        ListNode temp = head;
15        
16        while(temp != null){
17            len++;
18            temp = temp.next;
19        }
20
21        if (len == n) return head.next;
22
23        int diff = len - n;
24        temp = head;
25        for (int i = 1; i < diff; i++) {
26          temp = temp.next;
27        }
28        temp.next = temp.next.next;
29        return head;
30    }
31}