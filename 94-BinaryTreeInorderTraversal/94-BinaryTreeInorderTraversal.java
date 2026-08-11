// Last updated: 11/08/2026, 18:52:44
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        h1(root, ans);
        return ans;
    }
    private void h1(TreeNode root, List<Integer> res) {
        if (root != null){
            h1(root.left, res);
            res.add(root.val);
            h1(root.right, res);
        }
    }
}