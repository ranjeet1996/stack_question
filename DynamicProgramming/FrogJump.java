package DynamicProgramming;

public class FrogJump {
    public static void main(String[] args) {
        
    }
    
    boolean[][] dp;
    public boolean cancross(int[] stones){

        if(stones[1]!=1) return true;
        int n=stones.length;
        dp=new boolean[n][n];

        return helper(stones,0,1);

    }

    private boolean helper(int[] stones, int lastindex, int currentindex) {
        if(currentindex==stones.length-1){
            return true;
        }

        if(dp[lastindex][currentindex]) return false;

        int lastjump=stones[currentindex]-stones[lastindex];

        int nextindex=currentindex+1;

        while(nextindex<stones.length && stones[nextindex]<=stones[currentindex]+lastjump+1){
            int nextjump=stones[nextindex]-stones[currentindex];
            int jump=nextjump-lastjump;

            if(jump>=-1 && jump<=1){
                if(helper(stones, currentindex, nextindex)){
                    return true;
                }
            }
            nextindex++;
        }
        dp[lastindex][currentindex]=true;


        return false;
    }
    
}
