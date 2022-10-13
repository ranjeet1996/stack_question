package Tree.Easy;

public class ConverBTtoSumTree {
    public static void main(String[] args) {
        
    }


    public static int trasform(Node root){
        if(root==null) return 0;

        int left=trasform(root.left);
        int right=trasform(root.right);

        int old=root.data;
        root.data=left+right;

        return root.data+old;
    }


    
}
