class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(-1);
        temp.next = head;
        
        ListNode curr=temp, prev=temp, remove=head;
        int i=0;
        for(;i<n;i++){
            curr = curr.next;
        }
        ListNode temp1=head;
        int len=0;
        while(temp1!=null){
            len++;
            temp1=temp1.next;
        }
        
        while(curr.next!=null){
            curr = curr.next;
            prev=remove;
            remove=remove.next;
        }
        prev.next = remove.next;
        if(i==len)
            return prev.next;
        return temp.next;
        
    }
}


class Solution2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(-1);
        temp.next = head;

        ListNode slow = temp, fast = temp;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return temp.next;
    }
}