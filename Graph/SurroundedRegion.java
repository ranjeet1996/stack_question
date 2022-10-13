package Graph;

public class SurroundedRegion {
    public static void main(String[] args) {
        
    }

    private void solveHelper(char board[][], int x, int y) {
        if(x < 0
        || x >= board.length
        || y < 0
        || y >= board[0].length
        || board[x][y] != 'O') {
            return;
        }

        board[x][y] = '*';

        solveHelper(board, x - 1, y); //up
        solveHelper(board, x, y + 1); //right
        solveHelper(board, x + 1, y); //down
        solveHelper(board, x, y - 1); //left
    }

    public void solve(char[][] board) {
        int rowcount=board.length;
        int columncount=board[0].length;

        if(rowcount<=2 || columncount<=2) {
            return;
        } 
             //first row and last row
        for(int i=0;i<columncount;i++){
            if(board[0][i]=='0') {
                solvehelper(board,0,i);  //dfs
            }
            if(board[rowcount-1][i]=='0') {
                solvehelper(board,rowcount-1,i); //dfs
            }
        }   
        
         //first column and last column

         for (int i = 1; i < rowCount - 1; i++) {
            if (board[i][0] == 'O') {
                //dfs
                solveHelper(board, i, 0);
            }
            if (board[i][columnCount - 1] == 'O') {
                //dfs
                solveHelper(board, i, columnCount - 1);
            }
        }

        for(int i = 0; i < rowCount; i++) {
            for(int j = 0; j < columnCount; j++) {
                if(board[i][j] == 'O') {
                    board[i][j] = 'X';
                }

                if(board[i][j] == '*') {
                    board[i][j] = 'O';
                }
            }
        }


        
    }
    
}
