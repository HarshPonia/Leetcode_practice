package Class_Practice;

public class _0037_Sudoku_Solver {
    public void solveSudoku(char[][] board) {
        if(board==null || board.length == 0) return;
        solve(board);
    }
    public  boolean solve(char[][] board){
        for(int i =0;i<board.length;i++){
            for(int j =0 ;j<board.length;j++){
                if(board[i][j] == '.'){
                    for(char c = '1';c<='9';c++){
                        if(isvalid(board,i,j,c)){
                            board[i][j] = c;
                            if(solve(board)) return true;
                            else board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isvalid(char [][] board,int row, int col,char c){
        int nrow = 3*(row/3);
        int ncol = 3*(col/3);
        for(int i =0;i<9;i++){
            if(board[i][col] == c) return false;
            if(board[row][i] == c ) return false;
            if(board[nrow+i/3][ncol+i%3] ==c) return false;
        }
        return true;
    }


}
