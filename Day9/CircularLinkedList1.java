import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

class Implementation{
    Node head;

    void insert_at_end(int num){
        Node temp=new Node(num);
        if(head==null){
            head=temp;
            temp.next=head;
        }
        else{
            Node curr=head;
            while(curr.next!=head){
                curr=curr.next;
            }
            temp.next=curr.next;
            curr.next=temp;
        }

    }

    void insert_at_any_pos(int num,int pos){
        Node temp=new Node(num);
        if(pos==1){
            Node curr=head;
            do{
                curr=curr.next;
            }
            while(curr.next!=head);
            curr.next=temp;
            temp.next=head;
            head=temp;

        }
        else{
            int count=1;
            Node curr=head;
            do{
                if(count==pos){
                    
                }
                curr=curr.next;
                count++;
            }
            while(curr.next!=head);
        }
    }

    void remove_element(){

    }
    
    void replace(){

    }

    void reverse(){

    }

    void search(){

    }

    void print(){
        Node curr=head;
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        while(curr!=head);
        System.out.println();
    }
}


public class CircularLinkedList1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Implementation im=new Implementation();
        Node head=null;
        int n=sc.nextInt();
        while(n>0){
            im.insert_at_end(sc.nextInt());
            n--;
        }
        im.print();
        int num=sc.nextInt();
        im.insert_at_any_pos(num,1);
        im.print();
    }
}