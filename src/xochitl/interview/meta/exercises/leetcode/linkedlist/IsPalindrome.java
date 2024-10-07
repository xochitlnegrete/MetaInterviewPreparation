/*
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

Example 1:
Input: head = [1,2,2,1]
Output: true

Example 2:
Input: head = [1,2]
Output: false
*/
package xochitl.interview.meta.exercises.leetcode.linkedlist;

public class IsPalindrome {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        ListNode current = isPalindrome(l1, ,2);
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Encontrar el medio de la lista enlazada
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Invertir la segunda mitad de la lista
        ListNode secondHalf = reverseList(slow);

        // Comparar ambas mitades
        ListNode firstHalf = head;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;  // Si los valores no coinciden, no es un palíndromo
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;  // Es un palíndromo si todas las comparaciones fueron iguales
    }
    
    // Función para invertir una lista enlazada
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
