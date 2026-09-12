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
    public void reorderList(ListNode head) {
     ListNode slow=head;
     ListNode fast=head;
    //   Find middle
     while( fast!=null && fast.next!=null)
     { slow=slow.next;
        fast=fast.next.next; }
    // reverse left half
    ListNode curr =slow.next;
     slow.next=null;
   ListNode prev=null;
    while(curr!=null){
       ListNode nextNode=curr.next; curr.next=prev;
       prev=curr;
        curr=nextNode;
       }
    curr=prev;
    ListNode temp=head;
    ListNode head1=new ListNode(-1);
   ListNode dummy=head1;
    while(curr!=null) {
      dummy.next=temp;  temp=temp.next; dummy=dummy.next;
      dummy.next=curr;curr=curr.next; dummy=dummy.next;}
    while(temp!=null){
        dummy.next=temp;
        temp=temp.next;
        dummy=dummy.next;
    }
    return ;
}}