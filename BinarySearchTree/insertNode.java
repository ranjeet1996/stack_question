       package BinarySearchTree;

public class insertNode {
    public static void main(String[] args) {
        
    }
    // O(n); sc=O(h)
    Node  insert(Node root,int key){
        if(root==null){
            return new Node(key);
        }
        if(root.data>key){
            root.left=insert(root.left, key);
        }else if(root.data<key){
            root.right=insert(root.right, key);
        }
        return root;
    }

    // iterative
    //   O(logn);sc=O(1)
    Node insert1(Node root,int key){
        Node temp=new Node(key);
        Node curr=root;
        Node parent=null;

         while(curr!=null){
            parent=curr;
            if(key<curr.data){
                curr=curr.left;
            }else{
                curr=curr.right;
            }
         }

         if(parent==null){
            parent=temp;
         }else if(key<parent.data){
            parent.left=temp;
         }else{
            parent.right=temp;
         }
         return root;

 
   }


    
}
