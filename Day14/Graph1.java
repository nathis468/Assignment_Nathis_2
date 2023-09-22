import java.util.*;

class GraphNode{
    int data;
    List<TreeNode> al;
    GraphNode(int data){
        this.data=data;
        al=new ArrayList<>();
    }
}
    
class Implementation{
    GraphNode root;
    GraphNode insert_dfs(int num){
        if(root==null){
            root=new GraphNode(num);
            return root;
        }
        
    }
}

class Graph{
    public static void main(String args[]){
        GraphNode root=null;
    }
}