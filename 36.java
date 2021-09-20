class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9], col = new int[9][9];
        int[][][] block = new int[9][3][3];

        for(int i = 0;i < board.length;i ++) {
            for(int j = 0;j < board[0].length;j ++) {
                if(board[i][j] == '.') continue;
                int cur = board[i][j] - '1';
                row[cur][i] ++;
                col[cur][j] ++;
                block[cur][i/3][j/3] ++;
                if(row[cur][i] > 1 || col[cur][j] > 1 || block[cur][i/3][j/3] > 1) return false;
            }
        }
        return true;
    }
}