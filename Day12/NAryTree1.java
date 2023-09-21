import java.util.*;

class TreeNode{
    int data;
    List<TreeNode> al; 
    TreeNode(int data){
        this.data=data;
        al=new ArrayList<>();
    }
}

class Implementation{
    TreeNode root;
    Scanner sc=new Scanner(System.in);

    TreeNode insert(){
        System.out.println("Enter the root node : ");
        TreeNode temp=new TreeNode(sc.nextInt());
        root=temp;
        insert_dfs(root);
        return root;
    }

    void insert_dfs(TreeNode curr){     
        System.out.println("Do you want to insert child node for : "+curr.data);
        Boolean choice=sc.nextBoolean();
        if(choice){
            System.out.println("Please enter the node to insert : ");
            TreeNode temp=new TreeNode(sc.nextInt());
            curr.al.add(temp);
            insert_dfs(curr);
        }
        else{
            for(int i=0;i<curr.al.size();i++){
                insert_dfs(curr.al.get(i));
            }
        }
    }

    void traversal_bfs(TreeNode curr){
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(curr);
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            System.out.println("\nChild node for "+temp.data+" are :");
            int flag=0;
            for(int i=0;i<temp.al.size();i++){
                flag=1;
                System.out.println(temp.al.get(i).data);
                q.add(temp.al.get(i));
            } 
            if(flag==0){
                System.out.println("Null");
            }
        }
    }
    void traversal_dfs_preorder(TreeNode curr){
        System.out.print(curr.data+" ");
        if(curr.al.size()!=0){
            for(TreeNode val:curr.al){
                traversal_dfs_preorder(val);
            }
        }
    }
}
    
class NAryTree1 {
    public static void main(String args[]){
        TreeNode root=null;
        Implementation im=new Implementation();
        root=im.insert();
        im.traversal_bfs(root);
        im.traversal_dfs_preorder(root);
    }
}
