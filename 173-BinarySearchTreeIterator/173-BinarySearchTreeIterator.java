// Last updated: 11/08/2026, 18:51:56
public class BSTIterator {

    private TreeNode visit;
    private Stack<TreeNode>stack;
    public BSTIterator(TreeNode root){
        visit=root;
        stack=new Stack();
    }
    public boolean hasNext(){
        return visit!=null || !stack.empty();
    }
   public int next(){
        while (visit !=null){
            stack.push(visit);
            visit=visit.left;
        }
        TreeNode next=stack.pop();
        visit=next.right;
        return next.val;
    }
}
