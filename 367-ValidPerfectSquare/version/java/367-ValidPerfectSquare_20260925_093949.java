// Last updated: 25/09/2026, 09:39:49
1class Solution {
2    public int minDepth(TreeNode root) {
3        if (root == null) {
4            return 0;
5        }
6
7        if (root.left == null) {
8            return minDepth(root.right) + 1;
9        }
10
11        if (root.right == null) {
12            return minDepth(root.left) + 1;
13        }
14
15        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
16    }
17}