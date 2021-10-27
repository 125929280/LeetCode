class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0, r = matrix.length-1;
        int row = 0;
        while(l <= r) {
            int m = l + (r-l)/2;
            if(matrix[m][0] <= target) {
                row = m;
                l = m+1;
            } else r = m-1;
        }
        l = 0;
        r = matrix[0].length-1;
        while(l <= r) {
            int m = l + (r-l)/2;
            if(matrix[row][m] == target) return true;
            else if(matrix[row][m] < target) l = m+1;
            else r = m-1;
        }
        return false;
    }
}