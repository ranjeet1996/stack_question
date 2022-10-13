package BinarySearchTree;

public class CountNodeWithinRange {
    public static void main(String[] args) {
        int arr[] = { 15, 25, 20, 22, 30, 18, 10, 8, 9, 12, 6 };

        Node root=null;
        for(int key: arr){
            root=insert(root, key);
        }
        System.out.print(countnode(root,12,20));
        
    }
    public static int countnode(Node root,int low,int high){
        if(root==null){
            return 0;
        }
        int count=0;
        if(root.data>=low && root.data<=high){
            count+=1;
        }

        count+=countnode(root.left, low, high);

        return count + countnode(root.right, low, high);

    }
    public static Node insert(Node root,int key){
        if(root==null){
            return new Node(key);
        }
        if(key<root.data){
            root.left=insert(root.left, key);
        }else{
            root.right=insert(root.right, key);
        }
        return root;
    }
    
}
