import java.util.Scanner;

class Node {
  int data;
  Node next;
  Node(int d) {
    data = d;
    next = null;
  }
} 

public class Day_15_Linked_List {
       public static Node insert(Node head, int data) {
         
         
         Node n1 = new Node(data);
         if(head == null) {
          head = n1;  
         }
         else {
           Node continues = head;
            while(continues.next != null) {
              continues = continues.next;
            }
            Node n2 = new Node(data);
            continues.next = n2;
         }
          return head; 
      }

                             
public static void display(Node head) {
       Node start = head;
       while(start!=null) {
            System.out.print(start.data+ " ");
            start = start.next;
       }
}

public static void main(String []args) {
       Scanner sc = new Scanner(System.in);
       Node head = null;
       int N = sc.nextInt();
       while(N-- > 0) {
            int ele = sc.nextInt();
            //Node n=new Node (ele);
            head = insert(head,ele);
          }
           display(head);
       sc.close();
     }
}
