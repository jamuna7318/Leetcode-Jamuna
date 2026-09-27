// Last updated: 27/09/2026, 17:31:38
1class Solution {
2    public int[][] generateMatrix(int n) {
3        int[][] matrix = new int[n][n];
4
5        int top = 0, bottom = n - 1;
6        int left = 0, right = n - 1;
7        int num = 1;
8
9        while (top <= bottom && left <= right) {
10
11            for (int i = left; i <= right; i++) {
12                matrix[top][i] = num++;
13            }
14            top++;
15
16            for (int i = top; i <= bottom; i++) {
17                matrix[i][right] = num++;
18            }
19            right--;
20
21            if (top <= bottom) {
22                for (int i = right; i >= left; i--) {
23                    matrix[bottom][i] = num++;
24                }
25                bottom--;
26            }
27
28            if (left <= right) {
29                for (int i = bottom; i >= top; i--) {
30                    matrix[i][left] = num++;
31                }
32                left++;
33            }
34        }
35
36        return matrix;
37    }
38}