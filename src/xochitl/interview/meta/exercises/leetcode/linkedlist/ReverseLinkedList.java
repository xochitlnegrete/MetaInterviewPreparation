/*
Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

*/package xochitl.interview.meta.exercises.leetcode.linkedlist;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode current = removeNthFromEnd(head);
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null)    return head;
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        
        
        while (current != null) {
            next = current.next;  // Guarda el siguiente nodo
            current.next = prev;  // Invierte el enlace
            prev = current;  // Mueve `prev` hacia adelante
            current = next;  // Mueve `current` hacia adelante
        }
        
        return prev;
    }
}
