package Tree.Easy;

public class SkewedMeansONECHILD {
    public static void main(String[] args) {
        
    }
    public static boolean skewed(Node root){
       
        return getheight(root)==getsize(root);

    }

    private static int getsize(Node root) {
        if(root==null) return 0;

        return 1+getsize(root.left)+getsize(root.right);
       
    }
    private static int getheight(Node root) {
        if(root==null) return 0;

        return 1+ Math.max( getheight(root.left),getheight(root.right));
       
    }
    
}
