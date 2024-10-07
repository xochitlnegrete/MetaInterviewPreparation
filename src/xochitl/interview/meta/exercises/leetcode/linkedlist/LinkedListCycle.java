/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list that can be reached 
again by continuously following the next pointer. Internally, pos is used to denote the 
index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

Example 1:
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

Example 2:
Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

Example 3:
Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
*/
package xochitl.interview.meta.exercises.leetcode.linkedlist;

public class LinkedListCycle {
    public static void main(String[] args) {
        // Crear la lista enlazada con ciclo: 3 -> 2 -> 0 -> -4 -> (ciclo hacia 2)
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;  // Crea el ciclo

        // Verificar si la lista tiene ciclo
        boolean result = hasCycle(head);
        System.out.println(result);  // Debe imprimir true, ya que hay un ciclo
    }

    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)   return false;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null) {
            System.out.println(slow.val + " vs " + fast.val);
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)    return true;
        }

        return false;
    }
}
