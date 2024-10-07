/*
Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

*/package xochitl.interview.meta.exercises.leetcode.linkedlist;

public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(3);

        ListNode current = MergeTwoLists(l1, ,2);
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Crear un nodo ficticio para simplificar la creación de la lista resultante
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Recorremos ambas listas mientras ninguna haya llegado al final
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Si alguna de las listas aún tiene nodos, los agregamos al final
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Devolvemos la lista fusionada (omitiendo el nodo ficticio)
        return dummy.next;
        
        /*if(list1 == null)   {
            if(list2 == null)   return null;
            else    return list2;
        }
        if(list2 == null)   return list1;
        
        ListNode dummy = new ListNode(0);
        ListNode newList = dummy;
        
        while(list1 != null || list2 != null)   {
            //extract min
            int min = -101;
            if(list1 != null)   {
                System.out.print(list1.val);
                min = list1.val;
                //list1 = list1.next;
                
            }
            if(list2 != null)   {
                System.out.println(" - " + list2.val);
                min = Math.min(min, list2.val);
                //list2 = list2.next;
            }
            
            //compare
            if(list1 == null)   {
                System.out.println("adding list2 to newList: " + newList.val);
                newList.next = list2;
                newList.val = list2.val;
                list2 = list2.next;
            }
            else if(list2 == null)   {
                System.out.println("adding list1 to newList: " + newList.val);
                newList.next = list1;
                newList.val = list1.val;
                list1 = list1.next;
            }
            else    {
                if(min == list1.val)    {
                    if(list1 !=null)    {
                        newList.next = list1;
                        newList.val = list1.val;
                        System.out.println("adding list1 to newList: " + newList.val);
                        list1 = list1.next;
                    }
                }
                else    {
                    if(list2 != null)   {
                        newList.next = list2;
                        newList.val = list2.val;
                        System.out.println("adding list2 to newList: " + newList.val);
                        list2 = list2.next;
                    }
                }
            }
        }
        
        System.out.println("final newList: " + dummy.val);
        
        return dummy.next;*/
    }
}
