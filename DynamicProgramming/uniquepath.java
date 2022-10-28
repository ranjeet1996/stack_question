package DynamicProgramming;

public class uniquepath {
    public static void main(String[] args) {
        
    }

    public int Uniquepath(int m,int n){
        int pathDp[][]=new int[m][n];

        for(int i=0;i<n;i++){
            pathDp[0][i]=1;
        }
        for(int i=0;i<m;i++){
            pathDp[i][0]=1;
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                pathDp[i][j]=pathDp[i-1][j]+pathDp[i][j-1];
            }
        }
        return pathDp[m-1][n-1];
    }
    
}
