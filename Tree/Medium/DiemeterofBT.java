package Tree.Medium;

public class DiemeterofBT {
    public static void main(String[] args) {
        
    }
    int diameter = 0;

    private int getHeight(Node currentNode) {
        int height = 0;

        if(currentNode != null) {
            int leftHeight = getHeight(currentNode.left);
            int rightHeight = getHeight(currentNode.right);

            height = Math.max(leftHeight, rightHeight) + 1;

            diameter = Math.max(diameter, leftHeight + rightHeight);
        }

        return height;
    }

    public int diameterOfBinaryTree(Node root) {
        getHeight(root);

        return diameter;
    }
    
}
