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
    public ListNode middleNode(ListNode head) {
        ListNode SlowPointer = head;
        ListNode FastPointer = head;
        while(FastPointer!=null && FastPointer.next != null){
            SlowPointer=SlowPointer.next;
            FastPointer=FastPointer.next.next;
        }
        return SlowPointer;


        
    }
}