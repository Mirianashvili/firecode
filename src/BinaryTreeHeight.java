
public class BinaryTreeHeight {

    private class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
    }

    public int findHeight(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(findHeight(root.left),findHeight(root.right)) + 1;
    }
}
