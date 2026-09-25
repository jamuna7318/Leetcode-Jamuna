// Last updated: 25/09/2026, 09:41:31
1class Solution {
2    public List<String> binaryTreePaths(TreeNode root) {
3        List<String> result = new ArrayList<>();
4        findPaths(root, "", result);
5        return result;
6    }
7
8    public void findPaths(TreeNode root, String path, List<String> result) {
9        if (root == null) {
10            return;
11        }
12
13        path += root.val;
14
15        if (root.left == null && root.right == null) {
16            result.add(path);
17            return;
18        }
19
20        path += "->";
21
22        findPaths(root.left, path, result);
23        findPaths(root.right, path, result);
24    }
25}