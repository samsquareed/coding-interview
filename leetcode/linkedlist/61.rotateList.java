class Solution {
    
    public int Length(ListNode head){
        int len =0;
        while(head!=null){
            len++;
            head = head.next;
        }
        return len;
    }
    
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;
        int len = Length(head);
        if(k%len==0)
            return head;
        if(k>len)
            k = k%len;
        
        ListNode kNode = head, first=head,prev=head;
        for(int i=0;i<k-1;i++){
            kNode = kNode.next;
        }
        
        while(kNode.next!=null){
            kNode=kNode.next;
            prev=head;
            head=head.next;
        }
        kNode.next = first;
        prev.next=null;
        kNode.next=first;
        return head;
    }
}