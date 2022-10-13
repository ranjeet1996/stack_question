package Tree.Easy;

public class HeightBalance {
    public static void main(String[] args) {
        
    }

    private int getheight(Node current){
        if(current==null){
            return 0;
        }
        int leftheight=getheight(current.left);
        if(leftheight==-1) return -1;
           
        int rightheight=getheight(current.right);
        if(rightheight==-1) return -1;
        
        int diff=Math.abs(leftheight-rightheight); 
        if(diff>1) return -1;
        
        return Math.max(leftheight,rightheight)+1;
    }
    
    public boolean isBalanced(Node root) {
       int result= getheight(root);
        if(result!=-1){
            return true;
        }
            return false;
        
    }
    
}
