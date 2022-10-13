package Tree.Easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class PrintAllLeafToRoot {

    public static void main(String[] args) {
        
    }

    
    // Function to check if a given node is a leaf node or not
    public static boolean isLeaf(Node node) {
        return (node.left == null && node.right == null);
    }
 
    // Print path present in the list in reverse order (leaf to the root node)
    public static void printPath(Deque<Integer> path)
    {
        Iterator<Integer> itr = path.descendingIterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next()+ " ");
        }
        System.out.println();
    }
 
    // Recursive function to print all paths from leaf-to-root node
    public static void printLeafToRootPaths(Node node, Deque<Integer> path)
    {
        // base case
        if (node == null) {
            return;
        }
 
        // include the current node to the path
        path.addLast(node.data);
 
        // if a leaf node is found, print the path
        if (isLeaf(node)) {
            printPath(path);
        }
 
        // recur for the left and right subtree
        printLeafToRootPaths(node.left, path);
        printLeafToRootPaths(node.right, path);
 
        // backtrack: remove the current node after the left, and right subtree are done
        path.removeLast();
    }
 
    // The main function to print all paths from leaf-to-root node
    public static void printLeafToRootPaths(Node node)
    {
        // Deque to store leaf-to-root path
        Deque<Integer> path = new ArrayDeque<>();
 
        // call recursive function
        printLeafToRootPaths(node, path);
    }
 
  
    
}

