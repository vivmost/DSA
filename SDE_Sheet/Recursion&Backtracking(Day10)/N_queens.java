class Solution {
    List<List<String>> output = new ArrayList<List<String>>();
    int N;
    int size;
    
     private List<String> createBoard(char[][] state) {
        List<String> board = new ArrayList<String>();
        for (int row = 0; row < size; row++) {
            String current_row = new String(state[row]);
            board.add(current_row);
        }
        
        return board;
    }
    
    boolean isSafe (int row, int column, char[][] board) {
        int i, j;
        for (i = 0; i < column; i ++) {
            if (board[row][i] == 'Q') return false;
        }
         for (i = row, j = column; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q')
                return false;
          for (i = row, j = column; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 'Q')
                return false;
  
        return true;
    }
    
    
    
     void backtrack (int column, char[][] board) {
        if (column >= N) {
            output.add(createBoard(board));
            return;
        }
        for (int i = 0; i < N; i ++) {
            if (isSafe(i, column, board)) {
                board[i][column] = 'Q';
                backtrack(column + 1, board);
                board[i][column] = '.';
            }
        }
        
    }
    
    public List<List<String>> solveNQueens(int n) {
        this.N = n;
        this.size = n;
        char[][] board = new char[size][size];
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j ++) {
                board[i][j] = '.';
            }
        }
        
        backtrack(0, board);
        
        return output;
    }
}