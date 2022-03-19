class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
}   

class Solution {
    public void deleteNode(ListNode node) {
        ListNode curr = node, prev=node;
        
        while(curr!=null && curr.next!=null){
            curr.val = curr.next.val;
            prev=curr;
            curr = curr.next;
        }
        prev.next=null;
    }
}


class Solution1 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}