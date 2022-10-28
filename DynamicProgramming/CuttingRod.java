package DynamicProgramming;

public class CuttingRod {
    public static void main(String[] args) {
        
    }

    public int cutRod(int price[],int n){
        int dp[]=new int[n+1];

        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                dp[i]=Math.max(dp[i],price[j]+dp[i-j-1]);
            }
        }
        return dp[n];
    }
    
}