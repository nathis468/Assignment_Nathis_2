import java.util.Scanner;

class StackNode {
    int data;
    StackNode next;
    StackNode(int a) {
        data = a;
        next = null;
    }
}



class Implementation 
{
   
    StackNode top;
    
    void push(int a) 
    {
        StackNode temp=new StackNode(a);
        if(top==null){
            top=temp;
        }
        else{
            temp.next=top;
            top=temp;
        }
    }
    
    int pop() 
    {
        if(top==null){
            return -1;
        }
        else if(top.next==null){
            int num=top.data;
            top=null;
            return num;
        }
        else{
            int num=top.data;
            top=top.next;
            return num;
        }
    }

    int peek(){
        if(top==null){
            return -1;
        }
        else{
            return top.data;
        }
    }

    void print(){
        StackNode curr=top;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}

class Stack1 {

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        Implementation im=new Implementation();
        StackNode top=null;
        int n=sc.nextInt();
        while(n>0){
            im.push(sc.nextInt());
            n--;
        }

        im.print();

        System.out.println(im.peek());

        System.out.println(im.pop());

        System.out.println(im.peek());

        im.print();
    }
}