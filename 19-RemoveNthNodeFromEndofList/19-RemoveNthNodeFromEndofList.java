// Last updated: 4/15/2026, 10:26:05 PM
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
13        ListNode dummy = new ListNode();
14        dummy.next = head;
15        int len = 0;
16        while(dummy.next != null){
17            len++;
18            dummy = dummy.next;
19        }
20
21        if(len == n) return head.next;
22        int diff = len-n;
23
24        ListNode temp = new ListNode();
25        temp.next = head;
26        for(int i = 0; i < diff; i++){
27            temp = temp.next;
28        }
29
30        temp.next = temp.next.next;
31        return head;
32    }
33}