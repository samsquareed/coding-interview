class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode resultNode = new ListNode(-1);
        ListNode curr = resultNode;
        int sum = 0;
        while (l1 != null || l2 != null || carry != 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            carry = sum / 10;
            sum = 0;
        }
        return resultNode.next;
    }
}