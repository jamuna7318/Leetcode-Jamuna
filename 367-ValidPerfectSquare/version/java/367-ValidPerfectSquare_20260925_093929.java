// Last updated: 25/09/2026, 09:39:29
1class Solution {
2    public boolean isSymmetric(TreeNode root) {
3        return check(root.left, root.right);
4    }
5
6    public boolean check(TreeNode left, TreeNode right) {
7        if (left == null && right == null) {
8            return true;
9        }
10
11        if (left == null || right == null) {
12            return false;
13        }
14
15        if (left.val != right.val) {
16            return false;
17        }
18
19        return check(left.left, right.right) &&
20               check(left.right, right.left);
21    }
22}
23