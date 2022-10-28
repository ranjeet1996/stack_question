package DynamicProgramming;

public class MinimumPathSum {
    public static void main(String[] args) {
        
    }

    public int minpathsum(int[][] grid){
        int numberofRows=grid.length;
        int numberofColumns=grid[0].length;

        for(int i=1;i<numberofRows;i++){
            grid[i][0]=grid[i-1][0]+grid[i][0];
        }

        for(int i=1;i<numberofColumns;i++){
            grid[0][i]=grid[0][i-1]+grid[0][i];
        }

        for(int i=1;i<numberofRows;i++){
            for(int j=1;j<numberofColumns;j++){
                grid[i][j]=grid[i][j]+Math.max(grid[i-1][j],grid[i][j-1]);
            }
        }

        return grid[numberofRows-1][numberofColumns-1];
    }
    
}
