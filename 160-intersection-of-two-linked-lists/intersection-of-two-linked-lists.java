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
        ListNode a = headA;
        ListNode b = headB;

        int lenA = 0;
        int lenB = 0;

        while(a != null){
            lenA++;
            a = a.next;
        }

        while(b != null){
            lenB++;
            b = b.next;
        }

        a = headA;
        b = headB;

        while(lenA > lenB){
            lenA--;
            a = a.next;
        }

        while(lenB > lenA){
            lenB--;
            b = b.next;
        }

        while(a != b){
            a = a.next;
            b = b.next;
        }

        return a;
    }
}