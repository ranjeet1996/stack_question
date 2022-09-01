package BinarySearchTree;

public class CheackBST {
    public static void main(String[] args) {
        
    }
    boolean isBST(Node root){
        return isBSTutil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    boolean isBSTutil(Node node,int min,int max){
        if(node==null){
            return true;
        }
        if(node.data<min ||node.data>max){
            return false;
        }
        return (isBSTutil(node.left, min, node.data-1) && isBSTutil(node.right, node.data+1,max));
    }

    // in other way
    Node prev=null;
    boolean isBST1(Node node){
        if(node!=null){
            if(!isBST1(node.left))
            return false;
            if(prev!=null && node.data<=prev.data)
            return false;

            prev=node;
            return isBST1(node.right);
        }
        return true;
    }
    
}
