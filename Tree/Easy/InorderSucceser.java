package Tree.Easy;

// A class to store a binary tree node
class Node
{
    int data;
    Node left = null, right = null, next = null;
 
    Node(int data) {
        this.data = data;
    }
}
 
class Main
{
    // Function to set the next pointer of all nodes in a binary tree.
    // curr —> current node
    // prev —> previously processed node
    public static Node setNextNode(Node curr, Node prev)
    {
        // return if the tree is empty
        if (curr == null) {
            return prev;
        }
 
        // recur for the left subtree
        prev = setNextNode(curr.left, prev);
 
        // set the previous node's next pointer to the current node
        if (prev != null) {
            prev.next = curr;
        }
 
        // update the previous node to the current node
        prev = curr;
 
        // recur for the right subtree
        return setNextNode(curr.right, prev);
    }
 
    // Function to print inorder successor of all nodes of
    // binary tree using the next pointer
    public static void inorderSuccessor(Node root)
    {
        Node prev = null;
        Node curr = root;
 
        // set next pointer of all nodes
        setNextNode(curr, prev);
 
        // go to the leftmost node
        curr = root;
        while (curr.left != null) {
            curr = curr.left;
        }
 
        // print inorder successor of all nodes
        while (curr.next != null)
        {
            System.out.println("The inorder successor of " + curr.data + " is "
                                + curr.next.data);
            curr = curr.next;
        }
    }
 
}
