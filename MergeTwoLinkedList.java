/* Java program to merge two 
   sorted linked lists */
import java.util.*; 
  
/* Link list node */
class Node  
{ 
    int data; 
    Node next; 
    Node(int d) {data = d; 
                 next = null;} 
} 
      
class MergeLists  
{ 
Node head;  
  
/* Method to insert a node at  
   the end of the linked list */
public void addToTheLast(Node node)  
{ 
    if (head == null) 
    { 
        head = node; 
    } 
    else 
    { 
        Node temp = head; 
        while (temp.next != null) 
            temp = temp.next; 
        temp.next = node; 
    } 
} 
  
/* Method to print linked list */
void printList() 
{ 
    Node temp = head; 
    while (temp != null) 
    { 
        System.out.print(temp.data + " "); 
        temp = temp.next; 
    }  
    System.out.println(); 
} 
  
  
// Driver Code 
public static void main(String args[]) 
{ 
    /* Let us create two sorted linked 
       lists to test the methods  
       Created lists: 
           llist1: 5->10->15, 
           llist2: 2->3->20 
    */
    MergeLists llist1 = new MergeLists(); 
    MergeLists llist2 = new MergeLists(); 
      
    // Node head1 = new Node(5); 
    llist1.addToTheLast(new Node(5)); 
    llist1.addToTheLast(new Node(10)); 
    llist1.addToTheLast(new Node(15)); 
      
    // Node head2 = new Node(2); 
    llist2.addToTheLast(new Node(2)); 
    llist2.addToTheLast(new Node(3)); 
    llist2.addToTheLast(new Node(20)); 
      
      
    llist1.head = new Gfg().sortedMerge(llist1.head,  
                                        llist2.head); 
    llist1.printList();      
      
} 
} 
  
class Gfg 
{ 
/* Takes two lists sorted in  
increasing order, and splices  
their nodes together to make  
one big sorted list which is  
returned. */
Node sortedMerge(Node headA, Node headB){
    if(headA == null) return headB;
    if(headB == null) return headA;
    
    if(headA.data<=headB.data){
        headA.next = sortedMerge(headA.next,headB);
        System.out.println("sdf");
        return headA;
    }
    else{
        headB.next = sortedMerge(headA,headB.next);
        System.out.println("akl");
        return headB;
    }
}
//Node sortedMerge(Node headA, Node headB) 
//{   
//      if(headA == null) return headB;
//      if(headB == null) return headA;
//      
//      Node dummy = new Node(0);
//      Node curr = dummy;
//      
//      while(headA != null & headB != null){
//          if(headA.data<headB.data){
//              curr.next= headA;
//              headA = headA.next;
//          }
//          else{
//              curr.next = headB;
//              headB = headB.next;
//          }
//          curr= curr.next;
//      }
//      if(headA != null){
//          curr.next = headA;
//      }
//      if(headB != null){
//          curr.next = headB;
//      }
//      
//      return dummy.next;
//} 
} 