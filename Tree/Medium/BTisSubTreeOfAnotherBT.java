package Tree.Medium;

public class BTisSubTreeOfAnotherBT {
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node root2 = new Node(3);
        root2.left = new Node(6);
        root2.right = new Node(7);

        if (cheacksubtree(root, root2)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }

    public static boolean cheacksubtree(Node tree, Node subtree) {
        if (tree == subtree)
            return true;
        if (tree == null)
            return false;
        if (subtree == null)
            return true;

        if (isidentical(tree, subtree)) {
            return true;
        }
        return cheacksubtree(tree.left, subtree) || cheacksubtree(tree.right, subtree);

    }

    public static boolean isidentical(Node tree,Node subtree){
       if(tree==null && subtree==null){
        return true;
       }
       if(tree!=null && subtree!=null){
        if(tree.data==subtree.data && isidentical(tree.left, subtree.left) && isidentical(tree.right, subtree.right)){
            return true;
        }
       }
       return false;
    }

}
