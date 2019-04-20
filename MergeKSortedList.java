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
public class MergeKSortedList {
    public static Node SortedMerge(Node a, Node b)  
    {  
        Node result = null;  
        /* Base cases */
        if (a == null)  
            return b;  
        else if(b == null)  
            return a;  
    
        /* Pick either a or b, and recur */
        if(a.data <= b.data)  
        {  
            result = a;  
            result.next = SortedMerge(a.next, b);  
        }  
        else
        {  
            result = b;  
            result.next = SortedMerge(a, b.next);  
        }  
    
        return result;  
    }  
  
    // The main function that takes an array of lists  
    // arr[0..last] and generates the sorted output  
    public static Node mergeKLists(Node arr[])  
    {  
        int last = arr.length-1;
        // repeat until only one list is left  
        while (last != 0)  
        {  
            int i = 0, j = last;  
            System.out.println("top i "+i+" top j "+j);
    
            // (i, j) forms a pair  
            while (i < j)  
            {  
                // merge List i with List j and store  
                // merged list in List i 
                
                printList(arr[i]);
                System.out.println("");
                arr[i] = SortedMerge(arr[i], arr[j]);  
                printList(arr[i]);
                System.out.println("");
                System.out.println(i+" "+j);
                // consider next pair  
                i++; j--;  
                System.out.println(i+" "+j);
                
                // If all pairs are merged, update last  
                if (i >= j)  
                    last = j;  
                System.out.println(last+""+i);
            }  
        }  
    
        return arr[0];  
    }  
  
    /* Function to print nodes in a given linked list */
    public static void printList(Node node)  
    {  
        while (node != null)  
        {  
            System.out.print(node.data+" "); 
            node = node.next;  
        }  
    }  
  
    public static void main(String args[]) { 
        int k = 4; // Number of linked lists  
        int n = 4; // Number of elements in each list  
    
        // an array of pointers storing the head nodes  
        // of the linked lists  
        Node arr[]=new Node[k];  
    
        arr[0] = new Node(1);  
        arr[0].next = new Node(3);  
        arr[0].next.next = new Node(5);  
        arr[0].next.next.next = new Node(7);  
    
        arr[1] = new Node(2);  
        arr[1].next = new Node(4);  
        arr[1].next.next = new Node(6);  
        arr[1].next.next.next = new Node(8);  
    
        arr[2] = new Node(0);  
        arr[2].next = new Node(9);  
        arr[2].next.next = new Node(10);  
        arr[2].next.next.next = new Node(11);  
        
        arr[3] = new Node(3);
        arr[3].next = new Node(5);
        arr[3].next.next = new Node(23);
        
       
        // Merge all lists  
        Node head = mergeKLists(arr);  
        printList(head);  
    } 
} 
  
class Node 
{ 
    int data; 
    Node next; 
    Node(int data) 
    { 
        this.data=data; 
    } 
} 

