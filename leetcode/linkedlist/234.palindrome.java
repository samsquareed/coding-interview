class Solution {

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        Stack<Integer> st = new Stack<>();
 
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        while(slow!=null){
            st.push(slow.val);
            slow=slow.next;
        }
        while(!st.isEmpty()){
            if(head.val != st.pop())
                return false;
            head = head.next;
        }
        return true;
    }
}