package DynamicProgramming;

public class ClimbingStairs {
    public static void main(String[] args) {
        
    }

    public int ClimbingStairsArray(int n){
        if(n==1 || n==2){
            return n;
        }

        int steps[] = new int[n+1];
            steps[0]=0;
            steps[1]=1;
            steps[2]=2;

            for(int i=3;i<=n;i++){
                steps[i]=steps[i-1]+steps[i-2];
            }

            return steps[n];
        
    }
    
}
