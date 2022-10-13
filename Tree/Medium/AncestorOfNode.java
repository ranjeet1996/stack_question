package Tree.Medium;

public class AncestorOfNode {
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);

        Node node = root.right.left.left;    // Node 7
        printancestor(root, node);
        
    }
    public static boolean printancestor(Node root,Node node){
       if(root!=null) {
        if(root.data==node.data) {
           return true;
        }
       if(printancestor(root.left, node)||printancestor(root.right, node)){
        System.out.print(root.data+ " ");
        return true;
       }      
     }
     return false;

    }
    
}
