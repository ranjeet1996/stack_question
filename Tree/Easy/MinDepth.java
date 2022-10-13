package Tree.Easy;

public class MinDepth {

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.right = new Node(8);
        root.left.right.right = new Node(9);
        root.right.right.left = new Node(10);
        root.right.right.left = new Node(11);
        root.left.left.right.right = new Node(12);
 
        System.out.println("The minimum depth is " + mindepth(root));
        
    }
    public static int mindepth(Node root){
        if(root!=null){
            int left=mindepth(root.left);
            int right=mindepth(root.right);

            return Math.min(left,right)+1;
        }
        return 0;
    }
    
}
