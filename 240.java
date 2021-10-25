class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // for(int[] a:matrix) {
        //     int l = 0, r = a.length-1;
        //     while(l <= r) {
        //         int m = l + (r-l)/2;
        //         if(a[m] == target) return true;
        //         else if(a[m] > target) r = m-1;
        //         else l = m+1;
        //     }
        // }
        // return false;

        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = n-1;
        while(i < m && j >= 0) {
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] < target) i ++;
            else j --;
        }
        return false;
    }
}