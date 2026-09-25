// Last updated: 25/09/2026, 09:42:15
1class Solution {
2    public TreeNode searchBST(TreeNode root, int val) {
3        if (root == null || root.val == val) {
4            return root;
5        }
6
7        if (val < root.val) {
8            return searchBST(root.left, val);
9        }
10
11        return searchBST(root.right, val);
12    }
13}