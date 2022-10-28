package DynamicProgramming;

public class LongestCommanSequence {
    public static void main(String[] args) {
        
    }

    public int lca(String s1, String s2){
        char s1CharArr[]= s1.toCharArray();
        char s2CharArr[]= s2.toCharArray();

        int n=s1CharArr.length;
        int m=s2CharArr.length;

        int lcaTable[][]=new int[n+1][m+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0 || j==0){
                    lcaTable[i][j]=0;
                }else if(s1CharArr[i-1]==s2CharArr[j-1]){
                    lcaTable[i][j]=lcaTable[i-1][j-1]+1;
                }else{
                    lcaTable[i][j]=Math.max(lcaTable[i][j-1],lcaTable[i-1][j]);
                }
            }
        }

        return lcaTable[n][m];
    }
    
}
