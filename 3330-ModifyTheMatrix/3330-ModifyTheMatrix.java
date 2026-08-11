// Last updated: 11/08/2026, 15:58:48
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int[] max = new int[n];
        for (int j = 0; j < n; j++) {
            max[j] = Integer.MIN_VALUE;
        }
        for(int i = 0; i < m; i++){
            for (int j=0;j<n;j++){
                max[j] = Math.max(max[j], matrix[i][j]);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if (matrix[i][j]==-1) {
                    matrix[i][j]=max[j];
                }
            }
        }
        return matrix;
    }
}