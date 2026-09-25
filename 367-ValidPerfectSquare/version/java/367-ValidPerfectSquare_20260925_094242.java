// Last updated: 25/09/2026, 09:42:42
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3        if (matrix.length == 0) {
4            return 0;
5        }
6
7        int n = matrix[0].length;
8        int[] heights = new int[n];
9        int maxArea = 0;
10
11        for (char[] row : matrix) {
12            for (int i = 0; i < n; i++) {
13                if (row[i] == '1') {
14                    heights[i]++;
15                } else {
16                    heights[i] = 0;
17                }
18            }
19
20            maxArea = Math.max(maxArea, largestRectangleArea(heights));
21        }
22
23        return maxArea;
24    }
25
26    public int largestRectangleArea(int[] heights) {
27        Stack<Integer> stack = new Stack<>();
28        int maxArea = 0;
29
30        for (int i = 0; i <= heights.length; i++) {
31            int current = (i == heights.length) ? 0 : heights[i];
32
33            while (!stack.isEmpty() && current < heights[stack.peek()]) {
34                int height = heights[stack.pop()];
35
36                int width;
37                if (stack.isEmpty()) {
38                    width = i;
39                } else {
40                    width = i - stack.peek() - 1;
41                }
42
43                maxArea = Math.max(maxArea, height * width);
44            }
45
46            stack.push(i);
47        }
48
49        return maxArea;
50    }
51}