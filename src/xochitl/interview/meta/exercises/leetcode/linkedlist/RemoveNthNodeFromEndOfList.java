package xochitl.interview.meta.exercises.leetcode.linkedlist;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        //head.next.next = new ListNode(3);
        //head.next.next.next = new ListNode(4);
        //head.next.next.next.next = new ListNode(5);

        ListNode current = removeNthFromEnd(head, 1);
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null)   return head;
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

        System.out.println();

        return head;
    }
}
