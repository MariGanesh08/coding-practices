/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*
Given the head of a singly linked list and a number k, rotate the list to the right by k positions.
*/

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        int length = 0;
        ListNode temp = head;

        while (temp != null) {
            temp = temp.next;
            length++;
        }

        k = k % length;

        for (int i = 0; i < k; i++) {
            head = movelast(head);
        }
        return head;
    }

    private ListNode movelast(ListNode head) {
        ListNode secondlast = head;

        while (secondlast.next.next != null) {
            secondlast = secondlast.next;
        }
        ListNode last = secondlast.next;
        secondlast.next = null;
        last.next = head;
        return last;
    }
}
