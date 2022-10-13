package Tree.Medium;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class DiagonalSum {
    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
 
        diagonalsum(root);
        // DiagonalSum2(root);
        
    }
    public static void diagonalsum(Node root){
        Map<Integer,Integer>map=new HashMap<>();

        sumhelper(root,map,0);

        System.out.println(map.values());


    }
    private static void sumhelper(Node root, Map<Integer, Integer> map, int diagonal) {
        if(root==null) return ;

        map.put(diagonal,map.getOrDefault(diagonal,0)+root.data);

        sumhelper(root.left,map,diagonal+1);
        sumhelper(root.right, map, diagonal);
    }

    // other method;
    public static ArrayList<Integer> DiagonalSum2(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null) return ans;

        LinkedList<Node> q=new LinkedList<>();
        q.addLast(root);

        while(q.size()!=0){
            int size=q.size();
            int sum=0;
            while(size-->0){
                Node removenode=q.removeFirst();
                while(removenode!=null){
                    sum+=removenode.data;
                    if(removenode.left!=null) q.addLast(removenode.left);
                    removenode=removenode.right;
                }
            }
            ans.add(sum);
        }
        return ans;
    }
  
    
}
