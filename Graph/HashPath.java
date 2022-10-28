package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class HashPath {

    Map<Object, HashSet<Object>> graph;

    HashPath() {
        graph = new HashMap<>();
    }
    public static void main(String[] args) {
        
    }

    private boolean checkIfPathExists(Object u, Object v) {
        Set<Object> visitedSet = new HashSet<>();
        Stack<Object> stack = new Stack<>();

        stack.add(u);

        while(!stack.isEmpty()) {
            Object currentNode = stack.pop();

            if(!visitedSet.contains(currentNode)) {
                if(currentNode == v) {
                    return true;
                }
                visitedSet.add(currentNode);
            }

            HashSet<Object> neighbours = graph.get(currentNode);
            for(Object eachNeighbour : neighbours) {
                if (!visitedSet.contains(eachNeighbour)) {
                    stack.add(eachNeighbour);
                }
            }
        }

        return false;
    }
    
}
