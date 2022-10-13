package BinarySearchTree;

public class FindSuccessor {
    public static void main(String[] args) {
        
    }
    public static Node findsucc(Node root,Node succ,int key){
        if(root==null) return succ;

        if(root.data==key){
            if(root.right!=null){
                return findminium(root.right);
            }
        }else if(key<root.data){
            succ=root;
            return findsucc(root.left, succ, key);
        }
        else{
            return findsucc(root.right, succ, key);
        }
        return succ;
    }
    private static Node findminium(Node root) {
       while(root.left!=null){
        root=root.left;
       }
       return root;
    }
    
}
