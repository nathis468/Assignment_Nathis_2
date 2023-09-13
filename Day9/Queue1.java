import java.util.Scanner;

class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}

class Implementation{
    QueueNode front, rear;
    
	void enqueue(int a)
	{
	    QueueNode temp=new QueueNode(a);
	    if(front==null){
	        front=temp;
	        rear=temp;
	    }
	    else{
	        rear.next=temp;
	        rear=temp;
	    }
	}
	
	int dequeue()
	{
        if(front==null){
            return -1;
        }
        else{
            int num=front.data;
            front=front.next;
            return num;
        }
	}

    int peek(){
        if(front==null){
            return -1;
        }
        else{
            return front.data;
        }
    }

    void print(){
        QueueNode curr=front;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}




class Queue1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Implementation im=new Implementation();
        int n=sc.nextInt();
        while(n>0){
            im.enqueue(sc.nextInt());
            n--;
        }

        im.print();

        System.out.println(im.peek());

        System.out.println(im.dequeue());

        System.out.println(im.peek());

        im.print();
    }
}




