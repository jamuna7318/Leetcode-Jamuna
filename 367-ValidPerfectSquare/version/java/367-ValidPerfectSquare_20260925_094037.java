// Last updated: 25/09/2026, 09:40:37
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3        Stack<Integer> stack = new Stack<>();
4        int maxArea = 0;
5
6        for (int i = 0; i <= heights.length; i++) {
7            int currentHeight = (i == heights.length) ? 0 : heights[i];
8
9            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
10                int height = heights[stack.pop()];
11
12                int width;
13                if (stack.isEmpty()) {
14                    width = i;
15                } else {
16                    width = i - stack.peek() - 1;
17                }
18
19                maxArea = Math.max(maxArea, height * width);
20            }
21
22            stack.push(i);
23        }
24
25        return maxArea;
26    }
27}
28