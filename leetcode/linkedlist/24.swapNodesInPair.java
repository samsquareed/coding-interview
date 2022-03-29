class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        ListNode backFoot = new ListNode(-1);
        backFoot.next = head;
        ListNode temp = backFoot;
        
        while(temp.next!=null && temp.next.next!=null){
            ListNode first = temp.next;
            ListNode second = temp.next.next;
            first.next = second.next;
            temp.next = second;
            temp.next.next = first;
            temp = temp.next.next;
        }
        return backFoot.next;
    }
}