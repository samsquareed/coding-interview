import java.util.Stack;

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        Stack<Integer> stack = new Stack<>();

        ListNode currNode = head;
        while (currNode != null) {
            stack.push(currNode.val);
            currNode = currNode.next;
        }

        ListNode result = new ListNode();
        currNode = result;

        while (!stack.empty()) {
            currNode.next = new ListNode(stack.pop());
            currNode = currNode.next;
        }
        return result.next;
    }
}

class Solution1 {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null,next=null,curr=head;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}