class Solution {
    public int getDecimalValue(ListNode head) {

        ListNode next = null, prev = null, curr = head;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        int i = 0;
        int res = 0;
        while (prev != null) {
            res = res + prev.val * (int) Math.pow(2, i);
            i++;
            prev = prev.next;
        }
        return res;
    }
}