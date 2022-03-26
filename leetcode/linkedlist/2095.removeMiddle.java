
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

// some useful technique:
// slow.val = slow.next.val;   copy the value of next node to curr node.
// slow.next=slow.next.next;  then connect curr.next with next of next 
// i,e next node is skipped(bcz it's value already copied to curr node).