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
        if(head == null) return null;
        if(head.next == null) return head;
        List<ListNode> l = new ArrayList<>();

        while(head != null){
            l.add(head);
            head = head.next;
        }

        for(int i = l.size()-1;i>=1;i--){
            l.get(i).next = l.get(i-1);
        }

        l.get(0).next = null;

        return l.get(l.size()-1);
    }
}