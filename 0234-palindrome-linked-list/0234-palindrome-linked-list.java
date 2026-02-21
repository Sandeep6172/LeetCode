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
    public boolean isPalindrome(ListNode head) {
     ListNode Slow = head;
     ListNode Fast = head;
     while(Fast != null && Fast.next !=null)
     {
        Slow = Slow.next;
        Fast = Fast.next.next;
     }//Yaha Mid Slow Ke Paas Hai

     ListNode Prev = null;
     while(Slow != null){
        ListNode Next = Slow.next;//holding next node of slow
        Slow.next = Prev;
        Prev = Slow;//First Value Hold After Reversing
        Slow = Next; 
     }//Ulta -> After Mid

     ListNode Left = head;
     ListNode Right = Prev;
    while(Right != null){
        if(Left.val != Right.val) return false;
        Left = Left.next;
        Right = Right.next;
    }
    return true;
        
    }
}