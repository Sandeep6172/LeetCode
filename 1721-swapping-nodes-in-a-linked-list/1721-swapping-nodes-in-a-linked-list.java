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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast=head;
        while(--k>0){
            fast=fast.next;                     // begining with k'th value
            }
            ListNode x=fast;
            ListNode slow=head;
            while(fast.next!=null){
                fast=fast.next;
                slow=slow.next;                  //ending with k'th value
            }
            // swapping
            ListNode y=slow;
            int t=x.val;
            x.val=y.val;
            y.val=t;
            return head;

        
    }
}