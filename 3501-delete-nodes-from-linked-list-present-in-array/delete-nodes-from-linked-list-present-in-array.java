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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> hs = new HashSet<>();
        for(int x : nums)   hs.add(x);

        while(hs.contains(head.val) && head.next != null){
            head = head.next;
        }

        ListNode prev = head;
        ListNode cur = head.next;

        while(cur != null){
            if(hs.contains(cur.val)){
                prev.next = cur.next;
                cur = cur.next;
            } else{
                prev = cur;
                cur = cur.next;
            }
        }

        return head;
    }
}