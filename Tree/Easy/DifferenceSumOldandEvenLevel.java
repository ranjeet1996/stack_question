package Tree.Easy;

public class DifferenceSumOldandEvenLevel {
    public static void main(String[] args) {

    }

    public static int finddiff(Node root) {

        return helper(root, 0, 1);

    }

    private static int helper(Node root, int diff, int level) {
        if (root == null)
            return 0;

        if (level % 2 == 1) {
            diff = diff + root.data;
        } else {
            diff = diff - root.data;
        }
        diff = helper(root.left, diff, level + 1);
        diff = helper(root.right, diff, level + 1);

        return diff;
    }

}
