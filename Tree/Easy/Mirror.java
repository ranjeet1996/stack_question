package Tree.Easy;

public class Mirror {
    public static void main(String[] args) {
        
    }

    public static boolean ismirror(Node x,Node y){
        if(x==y) return true;

        return (x!=null && y!=null) && (x.data==y.data) &&
        ((ismirror(x.left, y.right)&&ismirror(x.right, y.left)) ||
         (ismirror(x.right, y.left)&&ismirror(x.left, y.right)) );
    }
    
}
