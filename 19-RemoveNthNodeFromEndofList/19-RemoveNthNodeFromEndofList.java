// Last updated: 4/14/2026, 5:41:59 PM
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
13    //     int len = 0;
14    //     ListNode temp = head;
15        
16    //     while(temp != null){
17    //         len++;
18    //         temp = temp.next;
19    //     }
20
21    //     if (len == n) return head.next;
22
23    //     int diff = len - n;
24    //     temp = head;
25    //     for (int i = 1; i < diff; i++) {
26    //       temp = temp.next;
27    //     }
28    //     temp.next = temp.next.next;
29    //     return head;
30
31
32    ListNode dummy = new ListNode(0);
33    dummy.next = head;
34
35    ListNode after = dummy;
36    ListNode curr = dummy;
37
38    for(int i = 0; i < n; i++) {
39        after = after.next;
40    }
41
42    while(after.next != null) {
43        after = after.next;
44        curr = curr.next;
45    }
46
47    curr.next = curr.next.next;
48
49    return dummy.next;
50
51
52    }
53}