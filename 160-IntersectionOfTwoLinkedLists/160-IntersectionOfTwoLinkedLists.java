// Last updated: 8/7/2025, 10:03:53 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null) return null;
        int s1 = 0;
        ListNode temp1 = headA;

        int s2 = 0;
        ListNode temp2 = headB;
        while(temp1 != null){
            s1++;
            temp1 = temp1.next;
        }

        while(temp2 != null){
            s2++;
            temp2 = temp2.next;
        }

        temp1 = headA;
        temp2 = headB;
        if(s1 > s2){
            int diff = s1-s2;
            for(int i = 0; i < diff; i++){
                temp1 = temp1.next;
            }
        }
        else{
            int diff = s2-s1;
            for(int i = 0; i < diff; i++){
                temp2  = temp2.next;
            }
        }

        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        return temp1;
    }
}