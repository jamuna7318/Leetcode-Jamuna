// Last updated: 25/09/2026, 09:40:17
1class Solution {
2    int diameter = 0;
3
4    public int diameterOfBinaryTree(TreeNode root) {
5        height(root);
6        return diameter;
7    }
8
9    public int height(TreeNode root) {
10        if (root == null) {
11            return 0;
12        }
13
14        int left = height(root.left);
15        int right = height(root.right);
16
17        diameter = Math.max(diameter, left + right);
18
19        return Math.max(left, right) + 1;
20    }
21}