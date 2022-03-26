
//idea is to maintain prev pointer while finding the middle node of list(slow and fast pointers)
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null)
            return null;
        ListNode slow = head,fast= head,prev=head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }
}