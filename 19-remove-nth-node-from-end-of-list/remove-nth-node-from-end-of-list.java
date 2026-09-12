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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null ||head.next==null) return null ;
             
        int m=0;
        ListNode temp=head;
        while(temp!=null)
        {
            m++;
            temp=temp.next;
        }
        temp=head;
        if(m==n)return head.next;
       for(int i=1;i<m-n;i++)
       {
            temp=temp.next;
       }
       temp.next=temp.next.next;
       return head;
    }
}