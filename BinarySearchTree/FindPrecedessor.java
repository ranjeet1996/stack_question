package BinarySearchTree;

public class FindPrecedessor {
    public static void main(String[] args) {
        
    }
    public static Node findpre(Node root,Node prec,int key){
        if(root==null) return prec;

        if(root.data==key){
            if(root.left!=null){
                return findmaxium(root.left);
            }
        }else if(key<root.data){
            return findpre(root.left, prec, key);
        }
        else{
            prec=root;
            return findpre(root.right, prec, key);
        }
        return prec;
    }
    private static Node findmaxium(Node root) {
       while(root.right!=null){
        root=root.right;
       }
       return root;
    }
    
}
