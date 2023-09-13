// traverse the linked list

// import java.util.Scanner;

// class Node {
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class Insert{
//     Node insert_at_end(Node head,int n){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the elements to be inserted : ");
//         while(n>0){
//             Node temp=new Node(sc.nextInt());
//             if(head==null){
//                 head=temp;
//             }
//             else{
//                 Node curr=head;
//                 while(curr.next!=null){
//                     curr=curr.next;
//                 }
//                 curr.next=temp;
//             }
//             n--;
//         }
//         return head;
//     }
// }


// class Print{
//     void print_list(Node head){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//         System.out.println();
//     }
// }

// public class SinglyLinkedList1{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("How many elements to be inserted : ");
//         int n=sc.nextInt();
//         Node head=null;
//         Insert in=new Insert();
//         head=in.insert_at_end(head, n);
//         Print p=new Print();
//         p.print_list(head);
//     }
// }










// insert element at any position

// import java.util.Scanner;

// class Node {
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class Insert{
//     Node insert_at_end(Node head,int n){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the elements to be inserted : ");
//         while(n>0){
//             Node temp=new Node(sc.nextInt());
//             if(head==null){
//                 head=temp;
//             }
//             else{
//                 Node curr=head;
//                 while(curr.next!=null){
//                     curr=curr.next;
//                 }
//                 curr.next=temp;
//             }
//             n--;
//         }
//         return head;
//     }
//     Node insert_at_any_pos(Node head,int pos){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the element to be inserted : ");
//         Node temp=new Node(sc.nextInt());
//         Node prev=null;
//         Node curr=head;
//         int count=1;
//         if(pos==1){
//             temp.next=head;
//             head=temp;
//         }
//         else{
//             while(curr!=null){
//                 if(count==pos){
//                     prev.next=temp;
//                     temp.next=curr;
//                     break;
//                 }
//                 prev=curr;
//                 curr=curr.next;
//                 count++;
//             }
//         }
//         if(pos>count){
//             prev.next=temp;
//         }
//         return head;
//     }
// }


// class Print{
//     void print_list(Node head){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//         System.out.println();
//     }
// }

// public class SinglyLinkedList1{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("How many elements to be inserted : ");
//         int n=sc.nextInt();
//         Node head=null;
//         Insert in=new Insert();
//         head=in.insert_at_end(head, n);
//         Print p=new Print();
//         p.print_list(head);
//         System.out.println("Enter the position to be inserted : ");
//         int pos=sc.nextInt();
//         head=in.insert_at_any_pos(head,pos);
//         p.print_list(head);
//     }
// }








// search an element in the linked list 

// import java.util.Scanner;

// class Node {
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class Insert{
//     Node insert_at_end(Node head,int n){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the elements to be inserted : ");
//         while(n>0){
//             Node temp=new Node(sc.nextInt());
//             if(head==null){
//                 head=temp;
//             }
//             else{
//                 Node curr=head;
//                 while(curr.next!=null){
//                     curr=curr.next;
//                 }
//                 curr.next=temp;
//             }
//             n--;
//         }
//         return head;
//     }
// }


// class Print{
//     void print_list(Node head){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//         System.out.println();
//     }
//     void search(Node head,int num){
//         int pos=1;
//         Node curr=head;
//         while(curr!=null){
//             if(curr.data==num){
//                 System.out.println("The given element is location in position : "+pos);
//                 return;
//             }
//             curr=curr.next;
//             pos++;
//         }
//         System.out.println("The given element is not loacted in the linked list");
//         return;
//     }
// }

// public class SinglyLinkedList1{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("How many elements to be inserted : ");
//         int n=sc.nextInt();
//         Node head=null;
//         Insert in=new Insert();
//         head=in.insert_at_end(head, n);
//         Print p=new Print();
//         p.print_list(head);
//         System.out.println("Enter the element to search for : ");
//         int num=sc.nextInt();
//         p.search(head,num);
//     }
// }









// remove a node at the any position

// import java.util.Scanner;

// class Node {
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class Insert{
//     Node insert_at_end(Node head,int n){
//         Scanner sc=new Scanner(System.in);
//         while(n>0){
//             Node temp=new Node(sc.nextInt());
//             if(head==null){
//                 head=temp;
//             }
//             else{
//                 Node curr=head;
//                 while(curr.next!=null){
//                     curr=curr.next;
//                 }
//                 curr.next=temp;
//             }
//             n--;
//         }
//         return head;
//     }
// }

// class Remove{
//     Node remove_at_any_pos(Node head,int num){
//         if(head.data==num){
//             head=head.next;
//             return head;
//         }
//         Node prev=null;
//         Node curr=head;
//         while(curr.data!=num){
//             prev=curr;
//             curr=curr.next; 
//         }
//         prev.next=curr.next;
//         return head;
//     }
// }

// class Print{
//     void print_list(Node head){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//         System.out.println();
//     }
// }

// public class SinglyLinkedList1{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         Node head=null;
//         Insert in=new Insert();
//         head=in.insert_at_end(head, n);
//         Print p=new Print();
//         p.print_list(head);
//         Remove rm=new Remove();
//         System.out.println("Element to remove : ");
//         int num=sc.nextInt();
//         head=rm.remove_at_any_pos(head,num);
//         p.print_list(head);
//     }
// }









// reverse the linked list

// import java.util.Scanner;

// class Node {
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class Insert{
//     Node insert_at_end(Node head,int n){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the elements to be inserted : ");
//         while(n>0){
//             Node temp=new Node(sc.nextInt());
//             if(head==null){
//                 head=temp;
//             }
//             else{
//                 Node curr=head;
//                 while(curr.next!=null){
//                     curr=curr.next;
//                 }
//                 curr.next=temp;
//             }
//             n--;
//         }
//         return head;
//     }
// }

// class Reverse{
//     Node reverse_list(Node head){
//         Node prev=null;
//         Node curr=head;
//         while(curr!=null){
//             Node next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         head=prev;
//         return head;
//     }
// }

// class Print{
//     void print_list(Node head){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//         System.out.println();
//     }
// }

// public class SinglyLinkedList1{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("How many elements to be inserted : ");
//         int n=sc.nextInt();
//         Node head=null;
//         Insert in=new Insert();
//         head=in.insert_at_end(head, n);
//         Print p=new Print();
//         p.print_list(head);
//         Reverse rs=new Reverse();
//         head=rs.reverse_list(head);
//         p.print_list(head);
//     }
// }









// replace an element 

// import java.util.Scanner;

// class Node {
//     int data;
//     Node next;
//     Node(int x){
//         data=x;
//         next=null;
//     }
// }

// class Insert{
//     Node insert_at_end(Node head,int n){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the elements to be inserted : ");
//         while(n>0){
//             Node temp=new Node(sc.nextInt());
//             if(head==null){
//                 head=temp;
//             }
//             else{
//                 Node curr=head;
//                 while(curr.next!=null){
//                     curr=curr.next;
//                 }
//                 curr.next=temp;
//             }
//             n--;
//         }
//         return head;
//     }
//     Node replace_element(Node head,int num,int new_num){
//         Node curr=head;
//         while(curr!=null){
//             if(curr.data==num){
//                 curr.data=new_num;
//             }
//             curr=curr.next;
//         }
//         return head;
//     }
// }


// class Print{
//     void print_list(Node head){
//         Node curr=head;
//         while(curr!=null){
//             System.out.print(curr.data+" ");
//             curr=curr.next;
//         }
//         System.out.println();
//     }
// }

// public class SinglyLinkedList1{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("How many elements to be inserted : ");
//         int n=sc.nextInt();
//         Node head=null;
//         Insert in=new Insert();
//         head=in.insert_at_end(head, n);
//         Print p=new Print();
//         p.print_list(head);
//         System.out.println("Enter the element to be replaced of : ");
//         int num=sc.nextInt();
//         System.out.println("Enter the new element to replace : ");
//         int new_num=sc.nextInt();
//         head=in.replace_element(head,num,new_num);
//         p.print_list(head);
//     }
// }