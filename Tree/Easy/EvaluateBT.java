package Tree.Easy;


class Node{
    String val;
    Node left,right;
    int data;
    Node(String val)
    {
        this.val = val;
    }
    public Node(int data){
        this.data=data;
    }
}

public class EvaluateBT {
    public static void main(String[] args) {
        Node root = new Node("+");
        root.left = new Node("*");
        root.right = new Node("/");
        root.left.left = new Node("-");
        root.left.right = new Node("5");
        root.right.left = new Node("21");
        root.right.right = new Node("7");
        root.left.left.left = new Node("10");
        root.left.left.right = new Node("5");

        System.out.println("The value of the expression tree is " + evaluate(root));

        
    }

    public static boolean isleaf(Node root){

        return (root.left==null && root.right==null);
    }

    public static double evaluate(Node root){
        if(root==null) return 0;

        if(isleaf(root)){
            return Double.valueOf(root.data);
        }
        double x=evaluate(root.left);
        double y=evaluate(root.right);

        return process(root.val,x,y);
        
    }

    private static double process(String op, double x, double y) {
        
        if (op.equals("+")) { return x + y; }
        if (op.equals("-")) { return x - y; }
        if (op.equals("*")) { return x * y; }
        if (op.equals("/")) { return x / y; }
 
        return 0;
    }
    
}
