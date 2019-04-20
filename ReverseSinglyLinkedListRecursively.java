/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode.problems;

/**
 *
 * @author abina
 */
public class ReverseSinglyLinkedListRecursively {
    static Node head; 
  
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } 
  
    // A simple and tail recursive function to reverse 
    // a linked list.  prev is passed as NULL initially. 
    Node reverseUtil(Node curr, Node prev) { 
  
        /* If last node mark it head*/
        if (curr.next == null) { 
            head = curr; 
  
            /* Update next to prev node */
            curr.next = prev; 
              
            return head; 
        } 
  
        /* Save curr->next node for recursive call */
        Node next1 = curr.next; 
  
        /* and update next ..*/
        curr.next = prev; 
  
        reverseUtil(next1, curr); 
        return head; 
    } 
  
    // prints content of double linked list 
    void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
  
    public static void main(String[] args) { 
        ReverseSinglyLinkedListRecursively list = new ReverseSinglyLinkedListRecursively(); 
        list.head = new Node(1); 
        list.head.next = new Node(2); 
        list.head.next.next = new Node(3); 
        list.head.next.next.next = new Node(4); 
        list.head.next.next.next.next = new Node(5); 
        list.head.next.next.next.next.next = new Node(6); 
        list.head.next.next.next.next.next.next = new Node(7); 
        list.head.next.next.next.next.next.next.next = new Node(8); 
  
        System.out.println("Original Linked list "); 
        list.printList(head); 
        Node res = list.reverseUtil(head, null); 
        System.out.println(""); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list.printList(res); 
    } 

}
