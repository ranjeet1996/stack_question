package Tree;

class Depth{
    int d;
    Depth(int d){
        this.d=d;
    }
}
public class burn {
    public static void main(String[] args) {
        
    }
    public static int minTime(Node root,int target){
    Depth depth=new Depth(-1);
    burntree(root,target,depth);
    return ans;
    }

    static int ans=-1;
    public static int burntree(Node root,int target,Depth depth) {
       if(root==null) return 0;
       if(root.data==target){
        depth.d=1;
        return 1;
       }
       Depth ld=new Depth(-1);
       Depth rd=new Depth(-1);

       int lh=burntree(root.left,target,ld);
       int rh=burntree(root.right ,target, rd);

       if(ld.d!=-1){
        ans=Math.max(ans,ld.d+1+rh);
        depth.d=ld.d+1;
       }else if(rd.d!=-1){
        ans=Math.max(ans,rd.d+1+lh);
        depth.d=rd.d+1;
       }
       return Math.max(lh,rh)+1;



    }
    
}

