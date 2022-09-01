package Tree;

public class SizeofBT {
    public static void main(String[] args) {
        
    }
    int size(Node root){
        if(root==null){
            return 0;
        }else{
            return size(root.left)+size(root.right)+1;
        }
    }
    
}
