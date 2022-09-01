package BinarySearchTree;

public class deleteNode {
    public static void main(String[] args) {
        
    }
    public static Node delet(Node root,int key){
        if(root==null){
            return root;
        }
        if(key<root.data){
            root.left=delet(root.left, key);
        }
        else if(key>root.data){
            root.right=delet(root.right, key);
        }
        else{
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            root.data=minvalue(root.right);
            root.right=delet(root.right, root.data);
        }
        return root;
    }

    public static int minvalue(Node root){
        int min=root.data;
        while(root.left!=null){
            min=root.left.data;
            root=root.left;
        }
        return min;
  }
    
}
