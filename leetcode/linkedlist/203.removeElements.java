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