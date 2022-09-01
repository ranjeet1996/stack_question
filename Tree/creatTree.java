package Tree;

import java.util.Scanner;

class Node{
    Node left,right;
    int data;
    public Node(int data){
        this.data=data;
    }
}

public class creatTree {
    static Scanner sc=null;
    public static void main(String[] args) {
         sc=new Scanner(System.in);
         Node root=creat();
         inorder(root);
         System.out.println();
         preorder(root);
         System.out.println();
         postorder(root);
         System.out.println();
    }


    static Node creat(){
        Node root=null;
        System.out.println("Enter data :");
        int data=sc.nextInt();
        if(data==-1) return null;
        root=new Node(data);
        System.out.println("Enter for left "+ data);
        root.left =creat();
        System.out.println("Enter for right "+ data);
        root.right=creat();
        return root;
    }
    static void inorder(Node root){
        // Left->Node->right
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }

    static void preorder(Node root){
        // Node->left->right
        if(root==null) return;
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root){
        // left->right->Node
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+ " ");
    }  
}
