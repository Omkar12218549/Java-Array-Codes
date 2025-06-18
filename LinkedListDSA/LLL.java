package LinkedListDSA;
public class LLL{

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode tempA = headA;
            ListNode tempB = headB;

            int lenA = 0, lenB = 0;

            while (tempA != null) {
                lenA++;
                tempA = tempA.next;
            }

            while (tempB != null) {
                lenB++;
                tempB = tempB.next;
            }

            tempA = headA;
            tempB = headB;

            if (lenA > lenB) {
                int step = lenA - lenB;
                for (int i = 0; i < step; i++) {
                    tempA = tempA.next;
                }
            } else {
                int step = lenB - lenA;
                for (int i = 0; i < step; i++) {
                    tempB = tempB.next;
                }
            }

            while (tempA != tempB) {
                tempA = tempA.next;
                tempB = tempB.next;
            }

            return tempA; // Will be null if no intersection
        }
    }

    // Sample main to test
    public static void main(String[] args) {
        // Create intersecting linked lists manually for testing
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);

        ListNode headA = new ListNode(3);
        headA.next = new ListNode(7);
        headA.next.next = common;

        ListNode headB = new ListNode(99);
        headB.next = new ListNode(1);
        headB.next.next = common;

        Solution sol = new Solution();
        ListNode intersection = sol.getIntersectionNode(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.val);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
