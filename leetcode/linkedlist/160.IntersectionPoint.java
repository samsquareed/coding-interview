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