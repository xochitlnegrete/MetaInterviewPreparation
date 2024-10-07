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
        ListNode dummy = new ListNode(0);  // Nodo ficticio para simplificar el caso donde se elimina el primer nodo
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        
        // Mover el puntero `first` n+1 pasos para que mantenga una distancia de `n` del puntero `second`
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        
        // Mover ambos punteros hasta que `first` llegue al final
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        
        // `second.next` es el nodo a eliminar
        second.next = second.next.next;
        
        return dummy.next;  // Devuelve la cabeza de la lista modificada
    }
}
