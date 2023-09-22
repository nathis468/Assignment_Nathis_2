import java.util.*;

class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int data){
        this.data=data;
        left=null;
        right=null;
    }
}

class Implementation{
    Scanner sc=new Scanner(System.in);
    TreeNode root=null;

    TreeNode insert(TreeNode root,int num){
        TreeNode temp=new TreeNode(num);
        if(root==null){
            root = temp;
            return root;
        }
        else if(root.data>temp.data){
            
            root.left=insert(root.left,num);
        }
        else if(root.data<temp.data){
            
            root.right=insert(root.right,num);
        }
        return root;
    }
    void traversal(TreeNode curr){
        if(curr==null){
            return;
        }
        traversal(curr.left);
        System.out.print(curr.data+" ");
        traversal(curr.right);
    }
    TreeNode binary_search(TreeNode root,int target){
        if(root==null){
            return root;
        }
        else if(root.data>target){
            root=binary_search(root.left,target);
        }
        else if(root.data<target){
            root=binary_search(root.right,target);
        }
        return root;
    }
}

public class BinarySearchTree1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        TreeNode root=null;
        Implementation im=new Implementation();
        // int num1=sc.nextInt();
        // root=im.insert(root,num1);
        // int num2=sc.nextInt();
        // root=im.insert(root,num2);
        // int num3=sc.nextInt();
        // root=im.insert(root,num3);
        // int num4=sc.nextInt();
        // root=im.insert(root,num4);
        // int num5=sc.nextInt();
        // root=im.insert(root,num5);
        // int num6=sc.nextInt();
        // root=im.insert(root,num6);
        // int num7=sc.nextInt();
        // root=im.insert(root,num7);

        System.out.println("Enter the root element : ");
        root=im.insert(root,sc.nextInt());
        System.out.println("Do you want to insert element ?");
        Boolean choice=sc.nextBoolean();
        while(choice){
            System.out.println("Enter the element : ");
            root=im.insert(root,sc.nextInt());
            System.out.println("Do you want to insert element ?");
            choice=sc.nextBoolean();
        }
        im.traversal(root);

        System.out.println("Enter the element to search");
        int target=sc.nextInt();
        root=im.binary_search(root,target);
        if(root!=null){
            System.out.println("The given element is found in the tree");
        }
        else{
            System.out.println("The given element is not found in the tree");
        }

        while(choice){
            System.out.println("Enter your choice \n1.Add an element \n2.Preorder traversal \n3.Inorder traversal \n4.PostOrder traversal \n5.")
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:

            case 6:
                System.exit();
        }
    }
}
