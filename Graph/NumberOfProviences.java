package Graph;

public class NumberOfProviences {
    public static void main(String[] args) {
        
    }

    public int findcircleNum(int[][] isconected) {
        int count=0;
        for(int i=0;i<isconected.length;i++){
            if(isconected[i][i]==1) {
                helper(isconected,i);
                count++;
            }
        }
        return count;
    }

    private void helper(int[][] isconected,int currentcity){
        for(int j=0;j<isconected.length;j++){
            if(isconected[currentcity][j]==1){
                isconected[currentcity][j]=isconected[j][currentcity]=0;
                helper(isconected, j);
            }
        }
    }
    
}
