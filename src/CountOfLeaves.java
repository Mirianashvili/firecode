
public class CountOfLeaves {
    private class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
    }

    public int numberOfLeaves(TreeNode root) {
        if(root != null){
            if(root.left == null && root.right == null){
                return 1 + numberOfLeaves(root.left) + numberOfLeaves(root.right);
            }
            return numberOfLeaves(root.left) + numberOfLeaves(root.right);
        }
        return 0;
    }
}
