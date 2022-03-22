class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next==null)
            return head;
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        
        while(head!=null && head.next!=null){
            if(head.val == head.next.val)
                head.next = head.next.next;
            else
                head=head.next;
        }
        return newHead.next;
    }
}

class Solution1 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = new ListNode(-1);
        ListNode result = newHead;
        newHead.next = head;

        while (newHead.next != null && newHead.next.next != null) {
            if (newHead.next.val == newHead.next.next.val)
                newHead.next = newHead.next.next;
            else
                newHead = newHead.next;
        }
        return result.next;
    }
}

class Solution2 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = new ListNode(-1);
        ListNode result = newHead;
        newHead.next = head;

        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                newHead.next = head.next;
            } else
                newHead = newHead.next;
            head = head.next;
        }
        return result.next;
    }
}

