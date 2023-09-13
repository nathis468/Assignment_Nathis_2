import java.util.Scanner;

class Node{
    Node prev;
    int data;
    Node next;
    Node(int x){
        prev=null;
        data=x;
        next=null;
    }
}

class Implementation{
    Node insert_end(Node head,int num){
        Node temp=new Node(num);
        if(head==null){
            head=temp;
        }
        else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=temp;
            temp.prev=curr;
        }
        return head;
    }
    Node insert_at_any_pos(Node head,int num,int pos){
        Node temp=new Node(num);
        if(pos==1){
            head.prev=temp;
            temp.next=head;
            head=temp;
        }
        else{
            int count=1;
            Node curr=head;
            while(curr!=null){
                if(count==pos){
                    temp.prev=curr.prev;
                    curr.prev.next=temp;
                    temp.next=curr;
                    curr.prev=temp;
                }
                curr=curr.next;
                count++;
            }
        }
        return head;
    }
    Node remove_element(Node head,int num){
        if(head.data==num && head.next==null){
            head=null;
        }
        else if(head.data==num){
            head=head.next;
            head.prev=null;
        }
        else{
            Node curr=head;
            while(curr!=null){
                if(curr.data==num){
                    if(curr.next==null){
                        curr.prev.next=null;
                    }
                    else{
                        curr.prev.next=curr.next;
                        curr.next.prev=curr.prev;
                    }
                }
                curr=curr.next;
            }
        }
        return head;
    }
    Node replace(Node head,int num1,int num2){
        Node temp=new Node(num2);
        if(head.data==num1 && head.next==null){
            head=temp;
        }
        else if(head.data==num1){
            temp.next=head.next;
            head.next.prev=temp;
            head=temp;
        }
        else{
            Node curr=head;
            while(curr!=null){
                if(curr.data==num1){
                    curr.prev.next=temp;
                    curr.next.prev=temp;
                    temp.prev=curr.prev;
                    temp.next=curr.next;
                }
                curr=curr.next;
            }
        }
        return head;
    }
    Node reverse(Node head){
        Node curr=head;
        Node temp=null;
        while(curr!=null){
            temp=curr.prev;   
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.prev;
        }
        head=temp.prev;
        return head;
    }
    void search_element(Node head,int num){
        int count=1;
        if(head.data==num){
            System.out.println("The gievn element present at position : "+count);
            return;
        }
        Node curr=head;
        while(curr!=null){
            if(curr.data==num){
                System.out.println("The gievn element present at position : "+count);
                return;
            }
            curr=curr.next;
            count++;
        }
        System.out.println("The given element is not present inside the list");
    }

    Node replaceElement(Node head,int val1,int val2)
    {
        Node f1=head;
        Node f2=head;
        int count=1;
        while(f1!=null && count!=val1)
        {
            f1=f1.next;
            count++;
        }
        count=1;
        while(f2!=null && count!=val2)
        {
            f2=f2.next;
            count++;
        }
        Node temp = new Node(f1.data);
        temp.next = f1.next;
        temp.prev = f1.prev;

        f1.next = f2.next;
        f1.prev = f2.prev;
        f2.next = temp.next;
        f2.prev = temp.prev;
        if(f1.next!=null){
            f1.next.prev = f1;
        }
        if(f1.prev!=null){
            f1.prev.next = f1;
        }
        if(f2.prev!=null){
            f2.prev.next = f2;
        }
        if(f2.next!=null){
            f2.next.prev = f2;
        }
        if(val1==1){
            head=f2;
        }

        return head;
    }

    void print(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}

class DoublyLinkedList1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Implementation im=new Implementation();
        Node head=null;
        System.out.println("Enter the total inputs : ");
        int n=sc.nextInt();
        System.out.println("Enter the elements : ");
        while(n>0){
            int num=sc.nextInt();
            head=im.insert_end(head,num);
            n--;
        }   
        im.print(head);

        System.out.println("Enter the element to be inserted : ");
        int num=sc.nextInt();
        System.out.println("Enter the position of the element to be inserted : ");
        int pos=sc.nextInt();
        head=im.insert_at_any_pos(head, num, pos);
        im.print(head);

        System.out.println("Enter the element to be deleted : ");
        int num1=sc.nextInt();
        head=im.remove_element(head,num1);
        im.print(head);

        System.out.println("Enter the element want to replace : ");
        int num2=sc.nextInt();
        System.out.println("Enter the element to be replaced of : ");
        int num3=sc.nextInt();
        head=im.replace(head, num2, num3);
        im.print(head);

        System.out.println("Enter the element want to search : ");
        int num4=sc.nextInt();
        im.search_element(head, num4);

        System.out.println("Before revesing the list : ");
        im.print(head);
        head=im.reverse(head);
        System.out.println("After reversing the list : ");
        im.print(head);
    }
}