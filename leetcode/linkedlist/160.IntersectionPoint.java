import java.util.HashSet;
import java.util.Set;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

// Traverse first list and add all its nodes address to a Set.
// Traverse second list and check if the nodes is already present in the Set. If its found, that means it is the intersection point for the lists.
// if not found, that means there is no intersection and hence return null.


class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> nodes = new HashSet<>();
        while(headA != null) {
            nodes.add(headA);
            headA = headA.next;
        }
        
        while (headB != null) {
            if (nodes.contains(headB)) 
                return headB;
            else 
                headB = headB.next;
        }
        return null;
    }
}


class Solution2 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            if (a == null) {
                a = headB;
            } else {
                a = a.next;
            }
            if (b == null) {
                b = headA;
            } else {
                b = b.next;
            }
        }
        return a;
    }
}


// My own logic :
class Solution3 {

    public int Length(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int len1 = Length(headA);
        int len2 = Length(headB);
        int diff = Math.abs(len1 - len2);

        if (len1 > len2) {
            for (int i = 0; i < diff; i++) {
                headA = headA.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                headB = headB.next;
            }
        }

        while (headA != null && headB != null) {
            if (headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}