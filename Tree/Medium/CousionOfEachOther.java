package Tree.Medium;

import java.util.LinkedList;
import java.util.Queue;

public class CousionOfEachOther {
    public static void main(String[] args) {
        
    }
    public boolean isCousins(Node root, int x, int y) {
        if (root == null) return false;
   Queue<Node> queue = new LinkedList<>();
   queue.offer(root);
   while (!queue.isEmpty()) {
       int size = queue.size();
       boolean isXexist = false;		
       boolean isYexist = false;		
       for (int i = 0; i < size; i++) {
           Node cur = queue.poll();
           if (cur.data == x) isXexist = true;
           if (cur.data == y) isYexist = true;
           if (cur.left != null && cur.right != null) { 
               if (cur.left.data == x && cur.right.data == y) { 
                   return false;
               }
               if (cur.left.data == y && cur.right.data == x) { 
                   return false;
               }
           }
           if (cur.left != null) {
               queue.offer(cur.left);
           }
           if (cur.right != null) {
               queue.offer(cur.right);
           }
       }
       if (isXexist && isYexist)  return true;
   }
   return false;

       
   }
    
}
