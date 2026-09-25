// Last updated: 25/09/2026, 09:50:54
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        int original = image[sr][sc];
4
5        if (original == color) {
6            return image;
7        }
8
9        dfs(image, sr, sc, original, color);
10
11        return image;
12    }
13
14    public void dfs(int[][] image, int r, int c, int original, int color) {
15        if (r < 0 || r >= image.length ||
16            c < 0 || c >= image[0].length ||
17            image[r][c] != original) {
18            return;
19        }
20
21        image[r][c] = color;
22
23        dfs(image, r + 1, c, original, color);
24        dfs(image, r - 1, c, original, color);
25        dfs(image, r, c + 1, original, color);
26        dfs(image, r, c - 1, original, color);
27    }
28}