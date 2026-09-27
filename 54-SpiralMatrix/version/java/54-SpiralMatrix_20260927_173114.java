// Last updated: 27/09/2026, 17:31:14
1import java.util.*;
2
3class Solution {
4    public List<Integer> spiralOrder(int[][] matrix) {
5        List<Integer> result = new ArrayList<>();
6
7        int top = 0;
8        int bottom = matrix.length - 1;
9        int left = 0;
10        int right = matrix[0].length - 1;
11
12        while (top <= bottom && left <= right) {
13
14            for (int i = left; i <= right; i++) {
15                result.add(matrix[top][i]);
16            }
17            top++;
18
19            for (int i = top; i <= bottom; i++) {
20                result.add(matrix[i][right]);
21            }
22            right--;
23
24            if (top <= bottom) {
25                for (int i = right; i >= left; i--) {
26                    result.add(matrix[bottom][i]);
27                }
28                bottom--;
29            }
30
31            if (left <= right) {
32                for (int i = bottom; i >= top; i--) {
33                    result.add(matrix[i][left]);
34                }
35                left++;
36            }
37        }
38
39        return result;
40    }
41}