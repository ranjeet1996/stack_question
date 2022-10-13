package Tree.Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class ZigzagTraversal {
    public static void main(String[] args) {
        
    }

    public List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root != null) {
            Queue<Node> queue = new LinkedList<>();
            boolean isZigZag = false;

            queue.add(root);

            while(!queue.isEmpty()) {
                List<Integer> currentLevel = new ArrayList<>();

                int queueSize = queue.size();

                for(int i = 0; i < queueSize; i++) {
                    Node temp = queue.poll();

                    if(!isZigZag) {
                        currentLevel.add(temp.data);
                    }
                    else {
                        currentLevel.add(0, temp.data);
                    }

                    if(temp.left != null) {
                        queue.add(temp.left);
                    }

                    if(temp.right != null) {
                        queue.add(temp.right);
                    }
                }

                result.add(currentLevel);
                isZigZag = !isZigZag;
            }
        }

        return result;
    }
    
}
