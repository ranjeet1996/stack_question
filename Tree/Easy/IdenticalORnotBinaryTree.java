package Tree.Easy;

public class IdenticalORnotBinaryTree {
    public static void main(String[] args) {
        
    }
    public static boolean isIdentical(Node x, Node y)
    {
        // if both trees are empty, return true
        if (x == null && y == null) {
            return true;
        }
         // if both trees are non-empty and the value of their root node matches,
        // recur for their left and right subtree
        return (x != null && y != null) && (x.data == y.data) &&
                    isIdentical(x.left, y.left) &&
                    isIdentical(x.right, y.right);
    }
}
