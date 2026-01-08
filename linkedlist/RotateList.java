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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0)return head;
        ListNode t = head;
        int c =1;
        while(t.next!=null){
            c++;
            t= t.next;
        }
        t.next=head;
        k=k%c;
        
        ListNode newHead;
        for(int i=0; i<c-k; i++){
            t = t.next;
        }
        newHead=t.next;
        t.next = null;
        return newHead;
        


    }
}