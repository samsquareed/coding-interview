class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return head;
        if(head.next == null && head.val == val)
            return null;
        ListNode frontNode = new ListNode();
        frontNode.next = head;
        ListNode temp = frontNode, curr=frontNode;
        
        while(curr.next!=null){
            if(curr.next.val == val)
                curr.next = curr.next.next;
            else
                curr=curr.next;
        }
        return temp.next;
    }
}

class Solution1 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode curr = head;
        ListNode prev = newHead;
        while (curr != null) {
            if (curr.val == val)
                prev.next = curr.next;
            else
                prev = prev.next;
            curr = curr.next;
        }
        return newHead.next;
    }
}