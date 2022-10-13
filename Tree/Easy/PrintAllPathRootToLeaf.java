package Tree.Easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class PrintAllPathRootToLeaf {
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.left = new Node(8);
        root.right.right.right = new Node(9);
        printpath(root);
        
    }
    public static void printpath(Node root){
       Deque<Integer>path=new ArrayDeque<>();

       helper(root,path);

    }

    private static void helper(Node root, Deque<Integer> path) {
        if(root==null){
            return ;
        }
        path.addLast(root.data);
        if(isleaf(root)){
            System.out.println(path);
        }
        helper(root.left, path);
        helper(root.right, path);

        path.removeLast();
    }

    public static boolean isleaf(Node root) {
        return root.left==null &&root.right==null;
    }
    
}
