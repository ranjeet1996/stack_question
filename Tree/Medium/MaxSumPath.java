package Tree.Medium;

public class MaxSumPath {
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(8);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.left.right.left = new Node(10);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(9);
        root.right.right.right = new Node(5);

        System.out.print(maxPathSum(root));
 
        
    }
    static int maxval;
    static int getvalue(Node curr){
        int value=0;
        if(curr!=null){
           int leftmax=getvalue(curr.left);
            int rightmax=getvalue(curr.right);
            
            value=Math.max(leftmax,rightmax)+curr.data;
            maxval=Math.max(maxval,leftmax+rightmax+curr.data);     
        }
        value=Math.max(0,value);
        return value;
    }
    
    public static int maxPathSum(Node root) {
        maxval=root.data;
        getvalue(root);
        return maxval;
    }
     
   
    
}
